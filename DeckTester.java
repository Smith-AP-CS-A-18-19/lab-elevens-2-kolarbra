/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] strang = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] strong = {"hearts", "spades", "diamonds", "clubs"};
		int[] ant = new int[52];
		Deck dack = new Deck(strang, strong, ant);
		System.out.println(dack.size());
		System.out.println(dack.deal());
		System.out.println(dack.size());
		dack.shuffle();
		System.out.println(dack.deal());
		System.out.println(dack.toString());
	}
}
