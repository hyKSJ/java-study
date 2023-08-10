package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		Goods[] goods = new Goods[COUNT_GOODS];
		String[] goods = new String[3];

		// 상품 입력
		for (int i = 0; i < 3; i++) {
			String line = scanner.nextLine();
			goods[i] = line;
		}

		for (int i = 0; i < 3; i++) {
			String[] infos = goods[i].split(" ");
			String name = infos[0];
			int price = Integer.parseInt(infos[1]);
			int count = Integer.parseInt(infos[2]);
			// 상품 출
			System.out.println(name + "(가격:" + price + "원)이 " + count + "개 입고 되었습니다.");
		}

		// 자원정리
		scanner.close();
	}
}
