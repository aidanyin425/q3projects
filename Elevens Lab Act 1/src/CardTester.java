/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card lol = new Card ("4", "Clubs", 1);
		Card no = new Card("4", "Spades", 1);
		Card poo = new Card("4", "Clubs", 1);
		
		System.out.println(lol.matches(no));
		System.out.println(poo.matches(lol));
	}
}
