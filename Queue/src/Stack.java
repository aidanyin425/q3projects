import java.util.ArrayList;

public class Stack<T> {
//use array list as backend structure
	// 1)) instance vars
	ArrayList<T> data;

	public void push(T t) {
		// 2)) what should constructor do?
		//data = new ArrayList<T>();
		data.add(0, t);
		
		
		// adds element at first spot in the stack
	}

	public T pop() {
		T top = data.get(0);
		if (data.isEmpty()) {
			return null;
		} else {
			data.remove(data.size() - 1);
			return top;
		}

	}
	// gets the top element of the stack
	// if it is empty dont pop any element
	// if it has size elements, remove the last element and then returning it

	// return the size of elements
	public int size() {
		return data.size();

	}
	//returns the size of the stack
	public boolean empty() {
		if(data.size() != 0) {
			return true;
		}
		return false;
	}
	
	//returns if stack is empty or not
	public T peek() {
		return data.get(0);
	}
	//takes the first element and returns it 
	
}