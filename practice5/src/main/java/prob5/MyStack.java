package prob5;


public class MyStack {
	private String[] buffer;
	private int top = 0;
	private int firstSize;
	
	public MyStack(int size) {
		buffer = new String[size];
		firstSize = size;
	}
	
	public void push(String s) {
		if (top == buffer.length) {
			String[] bufferData = buffer;
			buffer = new String[buffer.length + firstSize];
			for (int i = 0; i < bufferData.length;i++) {
				buffer[i] = bufferData[i];
			}
		}
		
		top += 1;
		
		buffer[top] = s;
		
	}

	public String pop() throws MyStackException {
		top -= 1;
		if (top == -1) {
			throw new MyStackException();			
		}
		return buffer[top];
	}
	
	public boolean isEmpty() {
		if (top == 0) {
			return true;
		}
		top -= 1;
		return false;
	}

}