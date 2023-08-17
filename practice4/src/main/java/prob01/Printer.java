package prob01;

public class Printer {
//	public void println(int message) {
//		System.out.println(message);
//	}
//	public void println(double message) {
//		System.out.println(message);
//	}
//	public void println(boolean message) {
//		System.out.println(message);
//	}
//	public void println(String message) {
//		System.out.println(message);
//	}

//	public <T> void println(T t) {
//		System.out.println(t);
//	}
	
	public <T> void println(T... ts) {
		for (T t : ts) {
			System.out.print(t);
			
		}
	}

//	public <T, P, Q> T println(P p, Q q) {
//
//		T a = null;
//		System.out.println();
//
//		return a;
//	}

	public int sum(Integer... nums) {
		int s = 0;
		for (Integer i : nums) {
			s += i;
		}
		return s;
	}
}
