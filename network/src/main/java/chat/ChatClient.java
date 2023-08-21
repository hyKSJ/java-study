package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class ChatClient {
	private static final String SERVER_IP = "127.0.0.1";

	public static void main(String[] args) {
		Socket socket = null;
		Scanner scanner = null;

		try {
			socket = new Socket();

			socket.connect(new InetSocketAddress(SERVER_IP, ChatServer.PORT));
			log("connected");

			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));

			System.out.print("닉네임>>");
			scanner = new Scanner(System.in);
			String nickname = scanner.nextLine();
			pw.println("join:" + nickname);

			new ChatClientThread(br).start();

			while (true) {
				System.out.print(">>");
				String line = scanner.nextLine();

				if ("quit".equals(line)) {
					pw.println("quit");
					break;
				}

				pw.println("message:" + line);


			}
		} catch (SocketException e) {
			System.out.println("[client] suddenly closed by server");
		} catch (IOException e) {
			System.out.println("[client] error: " + e);
		} finally {

			try {
				if (socket != null && !socket.isClosed()) {
					socket.close();
				}
				if (scanner != null) {
					scanner.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private static void log(String message) {
		System.out.println("[ChatClient] " + message);
	}

}
