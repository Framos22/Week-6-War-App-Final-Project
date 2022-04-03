package WeekSixCodingAssignment;

public class Card {
	//All Global Strings Are Private
	private int value;
	private String name;
	//Constructor
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
		
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//description
	public String toString() {
		return "The " + value + " of " + name;
	}
	public void describe() {
		System.out.println("Card value: " + value + "Suite: " + name);
		
	}

}
