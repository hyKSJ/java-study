package exception;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		try {
			MyClass myClass = new MyClass();
			myClass.danger();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (MyException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
