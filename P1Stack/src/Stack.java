import java.util.ArrayList;

public class Stack<T> {
//use array list as backend structure
	// 1)) instance vars
	ArrayList<T> data;

	public void push(T t) {
		// 2)) what should constructor do?
		data = new ArrayList<T>();
		data.add(0, t);
	}

	public T pop() {
		T top = data.get(0);
		if (data.isEmpty()) {
			throw new StackEmptyException();
		} else {
			data.remove(data.size() - 1);
			return top;
		}
		

	}

	// return the size of elements
	public int size() {
		return data.size();

	}
	public boolean empty() {
		if(data.size() != 0) {
			return true;
		}
		return false;
	}
	public T peek() {
		return data.get(0);
	}
	
	
}