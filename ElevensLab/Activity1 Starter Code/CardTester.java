/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("King","Hearts",13);
		Card card2 = new Card("Queen","Spades",12);
		Card card3 = new Card("King","Clubs",13);
		System.out.println("Does card 1 match card 2? " +card1.matches(card2));
		System.out.println("Does card 2 match card 3? " +card2.matches(card3));
		System.out.println("Does card 1 match card 3? " +card3.matches(card1));
		System.out.println("Card 1: "+card1.toString());
		System.out.println("Card 2: "+card2.toString());
		System.out.println("Card 3: "+card3.toString());
	}
}