package chapter03;

public class Student extends Person {
	public Student() {
		// 자식 생성자에서 부모 생성자를 명시적으로 호출하지 않으면, 자동으로 부모의 기본 생성자를 자식 생성자 코드 맨 앞에 호출한다.
		// 부모에게 기본 생성자가 없으면, 어쩔수없이 명시해줘야 함
//		super();
		System.out.println("Student() called");
	}
}
