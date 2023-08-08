package prob5;

public class Prob5 {

	public static void main(String[] args) {
		int i;
		int cnt;
		for (i = 1; i < 100; i++) {
			cnt = 0;
			if (i/10 !=0 && i / 10 % 3 == 0) {
				
				cnt += 1;
			}
			if (i%10 !=0 && i % 10 % 3 == 0) {
				cnt += 1;
			}
			if (cnt != 0) {
				System.out.print(i +" ");
				while (cnt > 0) {
					System.out.print("짝");
					cnt--;
				}
				System.out.println();
			}
		}
	}
}
