package util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NSLookup {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			while (true) {
				System.out.println(">> ");
				String line = scanner.nextLine();
				
				if("quit".equals(line)) {
					break;
				}
				
				InetAddress[] IpAddresses = inetAddress.getAllByName(line);
				for (InetAddress IpAddress : IpAddresses) {
					System.out.println(IpAddress);
				}
				
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
