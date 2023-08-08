package prob04;

import java.util.Arrays;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);

		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}

	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		int i;
		int j = 0;
		char[] c = new char[str.length()];
		for (i = str.length() - 1; i >= 0; i--) {
			c[j] = str.charAt(i);
			j++;
		}
		return c;
	}

	public static void printCharArray(char[] array) {
		/* 코드를 완성합니다 */
		System.out.println(Arrays.toString(array));
	}
}