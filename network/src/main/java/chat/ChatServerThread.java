package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;

public class ChatServerThread extends Thread {
	private String nickname;
	private Socket socket;
	List<PrintWriter> listWriters;
//	public static List<Writer> listWriters;

	public ChatServerThread(Socket socket, List<PrintWriter> listWriters) {
		this.socket = socket;
		this.listWriters = listWriters;
	}

	@Override
	public void run() {
		PrintWriter pw = null;
		BufferedReader br = null;

		try {
			InetSocketAddress remoteInetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			String remoteHostAddress = remoteInetSocketAddress.getAddress().getHostAddress();
			int remotePort = remoteInetSocketAddress.getPort();
			log("connected by client[" + remoteHostAddress + ":" + remotePort + "]");
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"), true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));

			while (true) {
				String data = br.readLine();
				if (data == null) {
					log("closed by client");
					doQuit(pw);
					break;
				}

//				log("received:" + data);
//				pw.println(data);

				String[] tokens = data.split(":");
				if ("join".equals(tokens[0])) {
					doJoin(tokens[1], pw);
				} else if ("message".equals(tokens[0])) {
					doMessage(tokens[1]);
				} else if ("quit".equals(tokens[0])) {
					doQuit(pw);
					break;
				} else {
					log("에러:알수 없는 요청(" + tokens[0] + ")");
				}
			}
		} catch (SocketException e) {
			log("suddenly closed by client");
		} catch (IOException e) {
			log("error:" + e);
		} finally {
			try {
				if (socket != null && !socket.isClosed()) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void doQuit(PrintWriter writer) {
		removeWriter(writer);
		String data = this.nickname + "님이 퇴장 하였습니다.";
		broadcast(data);
	}

	private void removeWriter(PrintWriter writer) {
		synchronized (listWriters) {
			listWriters.remove(writer);
		}
	}

	private void doMessage(String msg) {
		String data = this.nickname + ":" + msg;

		broadcast(data);

	}

	private void doJoin(String nickName, PrintWriter writer) {
		this.nickname = nickName;

		String data = nickName + "님이 참여하였습니다.";
		/* writer pool에 저장 */
		// ack
		broadcast(data);
		addWriter(writer);
		writer.println("join:ok");
		writer.flush();

	}

	private void addWriter(PrintWriter writer) {
		synchronized (listWriters) {
			listWriters.add(writer);
		}

	}

	private void broadcast(String data) {
		synchronized (listWriters) {
			for (PrintWriter writer : listWriters) {
				writer.println(data);
			}
		}
	}

	private void log(String message) {
		System.out.println("[ChatServer#" + getId() + "] " + message);
	}
}
