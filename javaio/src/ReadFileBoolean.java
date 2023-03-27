import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFileBoolean {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		File myobj = new File("boolean.txt");
		Scanner L = new Scanner(myobj);
		
		boolean[][] booleans = new boolean[8][9];
		for(int a = 0; L.hasNext(); a++) {
			String boolstring = L.nextLine();
			for(int j=0; j < boolstring.length(); j++) {
				if(boolstring.charAt(j) == '0') {
					booleans[a][j] = false;
				}
				else {
					booleans[a][j] = true;
				}
			}
			System.out.print(Arrays.deepToString(booleans));
		}
	}
}
			

