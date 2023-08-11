package chapter04;

public class ObjectTest03 {

	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");

		System.out.println(s1 == s2); // false
		// equals와 hascode가 동질성(같은내용)으로 판단되도록 override 되어있음
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.hashCode() + ":" + s2.hashCode()); // 같다
		System.out.println(System.identityHashCode(s1) + ":" + System.identityHashCode(s2));  // 주소기반이라 다름
		
		System.out.println("======================================");
		
		String s3 = "hello";
		String s4 = "hello";
		
		// 편하게 쓰라고 ==랑 주소기반도 동일함
		
		System.out.println(s3 == s4); // false
		System.out.println(s3.equals(s4)); // true
		System.out.println(s3.hashCode() + ":" + s4.hashCode()); // 같다
		System.out.println(System.identityHashCode(s3) + ":" + System.identityHashCode(s4));  // 주소기반이라 다름
		
	}

}
