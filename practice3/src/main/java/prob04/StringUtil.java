package prob04;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		String a = "";
		
		for (int i = 0; i < strArr.length; i++) {
			a += strArr[i];
		}
		
		return a;
	}
}
