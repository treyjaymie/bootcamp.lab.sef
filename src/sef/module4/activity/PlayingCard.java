package sef.module4.activity;

/**
 * This class represents a playing card 
 * 
 * @author ANTONIO Trey Jaymie
 *
 */

public class PlayingCard {

	public static final int ACE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	
	
	public static final int JOKER = 0;

	public static final int SPADES = 4;
	public static final int HEARTS = 3;
	public static final int DIAMONDS = 2;
	public static final int CLUBS = 1;



	/**
	 * Creates an instance of a PlayingCard given the specified parameters. Valid
	 * values for the number and suit parameters are the range of static attributes
	 * ACE to KING for number and CLUBS to SPADES for suit.  JOKER values can be 
	 * applied to suit and number.  
	 * 
	 * If a JOKER value or any invalid value is assigned assigned to either number or
	 * suit, then both number and suit are assigned the JOKER value.
	 * 
	 * @param number the number of the card
	 * @param suit the suit of the card
	 */
	
	
	//TODO #1: Write an instance variables that will handle the Integer value of number and suit.   
	int cardNum;
	int cardSuit;
	//END TODO #1
	
	
	public PlayingCard(int number, int suit) {
		
		//TODO #2: Write code that will filter number and suit with the range provided above.
		// Assign the number and suit argument to instance variable respectively
		// If the arguments were not filter, make a code that will assign instance variables to a JOKER value
		/*
		if (ACE <= number && number <= KING)
			cardNum = number;
		else
		{
			cardNum = JOKER;
			cardSuit = JOKER;
		}
		
		if (CLUBS <= suit && suit <= SPADES)
			cardSuit = suit;
		else
		{
			cardNum = JOKER;
			cardSuit = JOKER;
		}
		// Bug testing and comparisons with groupmate^
		//*/
		//*
		switch(number)
		{
		case ACE: cardNum = ACE; break;
		case TWO: cardNum = TWO; break;
		case THREE: cardNum = THREE; break;
		case FOUR: cardNum = FOUR; break;
		case FIVE: cardNum = FIVE; break;
		case SIX: cardNum = SIX; break;
		case SEVEN: cardNum = SEVEN; break;
		case EIGHT: cardNum = EIGHT; break;
		case NINE: cardNum = NINE; break;
		case TEN: cardNum = TEN; break;
		case JACK: cardNum = JACK; break;
		case QUEEN: cardNum = QUEEN; break;
		case KING: cardNum = KING; break;
		case JOKER: cardNum = JOKER;
					cardSuit = JOKER;
					return;
		default: cardNum = JOKER;
				 cardSuit = JOKER;
				 return;
		}
		//*/
		
		//*
		switch(suit)
		{
		case CLUBS: cardSuit = CLUBS; break;
		case DIAMONDS: cardSuit = DIAMONDS; break;
		case HEARTS: cardSuit = HEARTS; break;
		case SPADES: cardSuit = SPADES; break;
		default:
			cardNum = JOKER;
			cardSuit = JOKER;
			return;
		}
		//END TODO #2
		//*/
	
		}
			
	
	/**
	 * Creates an instance of a JOKER PlayingCard 
	 * 
	 */
	public PlayingCard(){

		//TODO #3: Make an instance of JOKER playing card
		// Assign instance variable to a JOKER value
		cardNum = JOKER;
		cardSuit = JOKER;
		//END TODO #3
		
		
		
		
	}

	/**
	 * Return the number of the card . Valid values returned can be one of the static fields of this
	 * class from ACE to KING or JOKER
	 * 
	 * @return the number 
	 */
	public int getNumber() {
		
		//TODO #4: Return the Integer value of the playing card
		// Return the value of current value of the number 
		return cardNum;
		//END TODO #4
	
		//return 0;
	}


	/**
	 * Return the suit of the card.  Valid values returned can be one of the static fields of this
	 * class from CLUBS to SPADES or JOKER
	 * 
	 * @return the suit
	 */
	public int getSuit() {

		//TODO #5: Return the Integer value of the playing card
		// Return the value of current value of the suit 
		return cardSuit;
		//END TODO #5

		//return 0;
	}


	/**
	 * Return a String representation of this card in the following form:
	 * "<number> of <suit>"
	 * 
	 * @return the String representation of this card
	 */
	public String toString() {
		
		//TODO #6: Make a code that will convert the Integer value of number and suit into String.
		// Return the String value of the current number and suit into a format "number of suit" 
		// Provide single space between number-of and of-suit.
		// It will be easier if a switch-case statement is use in the code. 
		// Make a code that will return the String value of JOKER if the default value was chosen
		String strNum;
		String strSuit;
		
		switch(cardNum) {
		case ACE: strNum = "ACE"; break;
		case TWO: strNum = "TWO"; break;
		case THREE: strNum = "THREE"; break;
		case FOUR: strNum = "FOUR"; break;
		case FIVE: strNum = "FIVE"; break;
		case SIX: strNum = "SIX"; break;
		case SEVEN: strNum = "SEVEN"; break;
		case EIGHT: strNum = "EIGHT"; break;
		case NINE: strNum = "NINE"; break;
		case TEN: strNum = "TEN"; break;
		case JACK: strNum = "JACK"; break;
		case QUEEN: strNum = "QUEEN"; break;
		case KING: strNum = "KING"; break;
		case JOKER:
			return "JOKER";
		default:
			return "JOKER";
		}
		
		switch(cardSuit) {
		case SPADES: strSuit = "SPADES"; break;
		case HEARTS: strSuit = "HEARTS"; break;
		case DIAMONDS: strSuit = "DIAMONDS"; break;
		case CLUBS: strSuit = "CLUBS"; break;
		case JOKER:
				return "JOKER";
		default:
			return "JOKER";
		}
		
		return String.format("%s of %s", strNum, strSuit);
		//END TODO #6
		
		//return "";
	}
}
