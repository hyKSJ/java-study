package prob2;

public class Prob2 {
	public static void main(String[] args) {
		/* 코드 작성 */
		int i;
		int j;
		for (i = 1; i < 11; i++) {
			for (j=i; j <i+10;j++) {
				System.out.print(j+" ");				
			}
			System.out.println();
		}
	}

}
