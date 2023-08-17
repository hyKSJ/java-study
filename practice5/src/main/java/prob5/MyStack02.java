package prob5;


public class MyStack02 {
	private Object[] buffer;
	private int top = 0;
	private int firstSize;
	
	public MyStack02(int size) {
		buffer = new Object[size];
		firstSize = size;
	}
	
	public void push(Object s) {
		if (top == buffer.length) {
			Object[] bufferData = buffer;
			buffer = new Object[buffer.length + firstSize];
			for (int i = 0; i < bufferData.length;i++) {
				buffer[i] = bufferData[i];
			}
		}
		
		
		buffer[top] = s;
		top += 1;
		
	}

	public Object pop() throws MyStackException {
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
		return false;
	}

}