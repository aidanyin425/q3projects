import java.util.ArrayList;

public class Queue<T> {
	// instance variables

	Stack<T> data = new Stack<>();
	Stack<T> data2 = new Stack<>();
	// constructor

	// methods
	public Queue() {
		// Stack<T>data = new Stack<>();
		// Stack<T> data2 = new Stack<>();
	}

	public void push(T el) {
		// add the 1st stack
		data.push(el);

	}

	public T pop() {
		// remove the first element of the first stack, then adding it to the other
		// stack
		T lol = data2.pop();
		if (lol == null) {
			while (data.size() != 0) {
				data2.push(data.pop());
			}
			lol = data2.pop();
		}
		return lol;
//		
	}

	public String toString() {
		for(int i = 0; i<data.size(); i++) {
			
		}
		
		
		
		return null;

	}

	public int size() {
		return data.size(); // return the first stack

	}

	public T peek() {
		if(data.size() == 0) {
			return null;
		}
		T lol = data2.pop();
		for(int i = 0; i < data.size(); i++) {
			data2.push(lol);
		}
		return data.peek();
	}

	public boolean empty() {
		if (data.size() == 0) {
			return true;
		}
		return false;
	}

}
