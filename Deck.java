package WeekSixCodingAssignment;
import java.util.*;


public class Deck {
	private ArrayList<Card> cards = new ArrayList<>();
	String[] suites= {"hearts", "clubs", "spades","diamonds"};
	//deck constructor
	public Deck(){
		for(int j = 0; j < 4; j++) {
			for(int i = 2; i <= 14; i++) {
				Card a = new Card(i, suites[j]);
					cards.add(a);
					}
				}
			}
		
	public void shuffle() {	
		Collections.shuffle(cards);	
	
	}
		
	public Card draw() {
		return cards.remove(0);
	}
	


}
