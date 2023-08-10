package chapter03;

public class StudentTest2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		Person p = s1;  // 업캐스팅(암시적, implicity)
		
		Student s2 = (Student)p; // 다운캐스킹(명시적, explicity)

	}

}
