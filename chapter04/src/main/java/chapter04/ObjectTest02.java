package chapter04;

public class ObjectTest02 {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		Point p3 = p2;

		// == : 두 객체의 동일성
		System.out.println(p1 == p2);   // false
		System.out.println(p2 == p3);   // true
		
		// equals : 두 객체의 동질성(내용비교)
		//        : 부모 클래스 Object의 기본 구현은 동일성(==) 비교와 같다.
		System.out.println(p1.equals(p2)); // true 이 예상되지만, false
		// 아래의 형태를 보면 원래 == 랑 같다. override 해줘야함
//	    public boolean equals(Object obj) {
//	        return (this == obj);
//	    }
		System.out.println(p2.equals(p3)); // true
		
	}

}
