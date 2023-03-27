import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadFileIntDouble {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File myObj = new File("intStringDouble.txt");
		Scanner L = new Scanner(myObj);
		//String doublestring = L.nextLine();
		double sum = 0;
		double sum1 = 0;
		while(L.hasNext()) {
			sum1 += L.nextDouble();
			String name = L.next();
			sum += L.nextDouble();
				
		}
		System.out.println(sum/6);
		System.out.println(sum1/6);
	
		
		}



	}


