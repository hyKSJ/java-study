package chat.gui;


import java.awt.*;
import java.awt.event.*;
import java.io.*;

import java.net.Socket;

public class ChatWindow {

	private Frame frame;
	private Panel pannel;
	private Button buttonSend;
	private TextField textField;
	private TextArea textArea;
	private PrintWriter pw;
	private BufferedReader br;
	private Socket socket;

	public ChatWindow(String name, Socket socket) {
		this.socket = socket;

		frame = new Frame(name);
		pannel = new Panel();
		buttonSend = new Button("Send");
		textField = new TextField();
		textArea = new TextArea(30, 80);
	}

	public void show() {
		// Button
		buttonSend.setBackground(Color.GRAY);
		buttonSend.setForeground(Color.WHITE);
		buttonSend.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});

		// Textfield
		textField.setColumns(80);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyCode = e.getKeyChar();
				if (keyCode == KeyEvent.VK_ENTER) {
					sendMessage();
				}
			}
		});

		// Pannel
		pannel.setBackground(Color.LIGHT_GRAY);
		pannel.add(textField);
		pannel.add(buttonSend);
		frame.add(BorderLayout.SOUTH, pannel);

		// TextArea
		textArea.setEditable(false);
		frame.add(BorderLayout.CENTER, textArea);

		// Frame
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				finish();
			}
		});
		frame.setVisible(true);
		frame.pack();

		updateTextArea("채팅창에 입장했습니다.");

		// IOStream 받아오기
		// ChatClientThread 생성하고 실행
		try {
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"), true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			new ChatClientThread().start();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	private void finish() {
		// quit 프로토콜 구현

		// exit java(JVM)
		System.exit(0);
	}

	private void sendMessage() {
		String message = textField.getText();
		if ("quit".equals(message)) {
			finish();
		} else {
			pw.println("message:" + message);
			textField.setText("");
			textField.requestFocus();
		}

		// ChatClientThread 에서 서버로 부터 받은 메세지가 있다고 치고~~
	}

	private void updateTextArea(String message) {
		textArea.append(message);
		textArea.append("\n");
	}

	private class ChatClientThread extends Thread {

		@Override
		public void run() {
			try {

				while (true) {

					String msg = br.readLine();
					
					updateTextArea(msg);
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
