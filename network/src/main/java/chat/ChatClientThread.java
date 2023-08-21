package chat;

import java.io.BufferedReader;
import java.io.IOException;

public class ChatClientThread extends Thread {
	private BufferedReader br;

	public ChatClientThread(BufferedReader br) {
		this.br = br;
	}


	@Override
	public void run() {

		try {

			while (true) {
				String msg = br.readLine();
				System.out.println(msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
