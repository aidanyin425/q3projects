import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadFile {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File myObj = new File("stringDouble.txt");
		Scanner L = new Scanner(myObj);
		//String doublestring = L.nextLine();
		double sum = 0;
		while(L.hasNext()) {
			String name = L.next();
			sum += L.nextDouble();
				
		}
		System.out.println(sum/6);
		

	}
}
