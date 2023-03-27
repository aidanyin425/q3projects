import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTester {
//	
//	@Test
//	void test() {
//		//fail("Not yet implemented");
//		
//	}
//	void testSize() {
//		Stack<Integer> temp = new Stack<Integer>();
//		
//		//assertEquals(expected, actual)
//		assertEquals(0, temp.size());
//	}
//	
//	
//	@Test
//	void testPush() {
//		//write that uses Stack to test that it is functioning as expected and minimizes the other parts of its code
//		Stack<Integer> f = new Stack<Integer>();
//		f.push(6);
//		f.push(14);
//		assertEquals(6, f.pop());
//		assertEquals(14, f.pop());
//	}
//	void testPop() {
//		//What series of code can you write so you can test that popping works
//		//test when stack is empty
//		Stack<Integer> s = new Stack<Integer>();
//		s.push(231);
//		s.push(12);
//		s.pop();
//	}
//	
//	@Test
//	void testPopPushSize() {
//		//Stack<Integer> d = new Stack<Integer>();
//		
//	}
//	
//	@Test
//	void testPeek() {
//		Stack<Integer> a = new Stack<Integer>();
//		a.push(124);
//		a.push(11347);
//		a.push(25);
//		assertEquals(25, a.peek());
//	 
//	
//	@Test
//	void testIsEmpty() {
//		//Stack<Integer> n = new Stack<Integer>();
//	}
	
	public static void main(String[] args) {
		
		//Stack<Integer> a = new Stack<Integer>();
		
		try {
			Stack<Integer> a = new Stack<Integer>();
			a.pop();
		}catch(StackEmptyException e) {
			e.printStackTrace();
		}
		
	}
}
