package WeekSixCodingAssignment;

public class App {

	public static void main(String[] args) {
		
		Deck warDeck = new Deck();	// Instantiates the deck
		
		warDeck.shuffle();	// Shuffles deck using the shuffle method

		Player Olivia = new Player("Olivia");	
		Player Tori = new Player("Tori");

		
		for(int i = 1; i < 26; i++) {	
			Olivia.draw(warDeck);
			Tori.draw(warDeck);
		}

		for(int i = 1; i < 26; i++) {
			int oliviaCard = Olivia.flip().getValue();
			int toriCard = Tori.flip().getValue();

			if(toriCard > oliviaCard) {
				Tori.incrementScore();
			}
			else if(oliviaCard > toriCard) {
				Olivia.incrementScore();
			}
		}
		if(Olivia.getScore() > Tori.getScore()) {
			System.out.println("Olivia has a score of " +Olivia.getScore() + ", Olivia wins!");
			System.out.println("Tori has a score of " + Tori.getScore() + ", Tori Loses!");
		} 
		else if(Tori.getScore() > Olivia.getScore()) {
			System.out.println("Tori has a score of " + Tori.getScore() + ", Tori Wins!");
			System.out.println("Olivia has a score of " + Olivia.getScore() + ", Olivia Loses!");
		}
		else{
			System.out.println("The score equals " + Olivia.getScore() + ", it's a Draw!");
		}
	}

	}


