package prob05;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException() {
		super("사용자를 찾을 수 없습니다.");
	}
}
