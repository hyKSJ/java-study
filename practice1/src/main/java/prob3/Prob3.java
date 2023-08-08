package prob3;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		System.out.println("숫자를 입력하세요:");

		int number = scanner.nextInt();
		int sum = 0;

		while (number > 0) {
			sum += number;
			number -= 2;
		}
		
		System.out.println("결과값 : " + sum);

		scanner.close();
	}
}