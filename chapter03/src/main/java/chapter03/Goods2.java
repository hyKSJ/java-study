package chapter03;

public class Goods2 {
	public String name;     // 모든 접근 가능
	protected int price;    // 같은 패키지 or **자식클래스만 접근 가능
	int countStock; // 같은 패키지(디폴트)에서만 접근 가능
	private int countSold;  // 클래스 내부에서만 접근 가능
}
