/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks1 = {"A","B","C"};
		String[] suits1 = {"Giraffes","Lions"};
		int[] values1 = {2,1,6};
		Deck deck1 = new Deck(ranks1, suits1, values1);
		System.out.println("Is deck 1 empty? " + deck1.isEmpty());
		System.out.println("Number of cards in deck 1: " + deck1.size());
		System.out.println("First card dealt of deck 1: " + deck1.deal());
		
		String[] ranks2 = {"D","E","F"};
		String[] suits2 = {"Monkeys","Goats"};
		int[] values2 = {7,9,3};
		Deck deck2 = new Deck(ranks2, suits2, values2);
		System.out.println("Is deck 2 empty? " + deck2.isEmpty());
		System.out.println("Number of cards in deck 2: " + deck2.size());
		System.out.println("First card dealt of deck 2: " + deck2.deal());
		
		String[] ranks3 = {"G","H","I"};
		String[] suits3 = {"Dinosaurs","Wolves"};
		int[] values3 = {4,8,5};
		Deck deck3 = new Deck(ranks3, suits3, values3);
		System.out.println("Is deck 3 empty? " + deck3.isEmpty());
		System.out.println("Number of cards in deck 3: " + deck3.size());
		System.out.println("First card dealt of deck 3: " + deck3.deal());
	}
}
