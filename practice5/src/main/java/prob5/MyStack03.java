package prob5;


public class MyStack03<T> {
	private T[] buffer;
	private int top = 0;
	private int firstSize;
	
	public MyStack03(int size) {
		buffer = (T[]) new Object[size];
		firstSize = size;
	}
	
	public void push(T s) {
		if (top == buffer.length) {
			T[] bufferData = buffer;
			buffer = (T[]) new Object[buffer.length + firstSize];
			for (int i = 0; i < bufferData.length;i++) {
				buffer[i] = bufferData[i];
			}
		}
		
		
		buffer[top] = s;
		top += 1;
		
	}

	public T pop() throws MyStackException {
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