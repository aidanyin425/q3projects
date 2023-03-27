import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class names {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File a = new File("Popular_Baby_Names.csv");
		Scanner s = new Scanner(a);
		int sum = 0; 
		//String female = "FEMALE";	
		while(s.hasNext()) {
			String gender = s.next();
			sum++;
			
		}
		s.close();
		
		System.out.println(sum);

	}

}
