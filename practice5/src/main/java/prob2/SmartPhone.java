package prob2;

public class SmartPhone extends MusicPhone {
	public void execute(String function) {
		if (function.equals("음악")) {
			System.out.println("다운로드해서 음악재생");
			return;
		} else if (function.equals("통화")) {
			System.out.println("통화기능시작");
		} else {
			System.out.println("앱실행");
			
		}
	}
}
