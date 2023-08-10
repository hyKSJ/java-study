package chapter03;

public class StaticMethod {
	int n;
	static int m;
	
	void f1() {
		n = 10;
	}
	
	void f2() {
		
		// 같은 클래스의 클래스(static) 변수 접근에서는 클래스 이름 생략 가능
//		StaticMethod.m = 20;
		m = 20;
	}
	
	void f3() {
		f2();
	}
	
	void f4() {
//		StaticMethod.s1();
		s1();
	}
	
	static void s1() {
		// 인스턴트 변수에 접근안됨
//		n = 10;
	}
	
	static void s2() {
		// 인스턴트 함수에 접근안됨
//		f1();
	}
	
	static void s3() {
//		StaticMethod.m = 20;
		m = 20;
	}
	
	static void s4() {
//		StaticMethod.s1();
		s1();
	}
}

