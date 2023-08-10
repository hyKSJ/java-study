package chapter03;


// 콜바이 레퍼런스!! 주소가 레퍼런스로 되어서, 스왑이 될 수 있다. 콜바이 벨루에서의 벨루가 레퍼런스가 됨
import mypackage.Value;

public class SwapTest3 {

	public static void main(String[] args) {
		Value a = new Value(10);
		Value b = new Value(20);

		System.out.println("a=" + a + ", b=" + b);

		
		swap(a, b);
//		int temp = a;
//		a = b;
//		b = temp;

		System.out.println("a=" + a + ", b=" + b);

	}

	private static void swap(Value m, Value n) {
		int temp = m.val;
		m.val = n.val;
		n.val = temp;

	}

}

