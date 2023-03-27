
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//		int[] vals = {1 ,3 ,5, 7, 9};
//		double result = average(vals);
//		System.out.println(50/0);
//		
//		}catch(ArrayIndexOutOfBoundsException e) {
//			//if this exception is thrown, go here 
//			System.out.println("you went out of bounds lololol");
//			//e.printStackTrace();
//		}catch(ArithmeticException e) {
//			System.out.println("stupidm");
//		}catch(NullPointerException r) {
//			
//		}catch(Exception e) {
//			
//		}
//		
		//write code that will result in a arithmetic related exception
		//get the code to throw a null exception 
		
		//System.out.println(50/0);
		
		//null related exception
		//int[] 
		
		try {
			daniel();
		} catch (DanielException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static double average (int[] vals) {
		//returns the avg of elements in vals
		double avg = 0;
		for(int i = 0; i <= vals.length; i++) {
			avg += vals[i];
		}
		return avg/vals.length;
	}
	public static 	void daniel() throws DanielException{
		
		throw new DanielException();
	}

}
