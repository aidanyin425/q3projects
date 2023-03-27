import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		try {
			File myObj = new File("ints.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextInt()) {
				int data = myReader.nextInt();
				total += data;
				//System.out.println(data);
			}
			myReader.close();
			System.out.println(total/8);

		} catch (FileNotFoundException e) {
			System.out.println("An error occured.");
		}
	}
}
