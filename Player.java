package WeekSixCodingAssignment;

import java.util.ArrayList;

public class Player {
	
	//fields
		ArrayList<Card> hand = new ArrayList<>();
	    int score;
		String name;

		public Player(String playerName) {
			name = playerName;
		}

		public void describe() {
			System.out.println("Player Name: " + name + "Player Score: " + score);
			
			// This is printing card info
			for (Card card: hand) {
					card.describe();
			}
			System.out.println(name + ": " + hand);
		}

		public Card flip() {
			return hand.remove(0);
		}

		public void draw(Deck warDeck) {
			Card card = warDeck.draw();
				hand.add(card);
		}

		public void incrementScore() {
			this.score++;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}

	}
	


