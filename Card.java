public class Card
{
    private int _suit, _value;
    public Card(int value,int suit)
    {
    	_value = _suit = -1;
    	if(value > 0 && value < 14)
    		_value = value;
    	if(suit > 0 && suit < 4)
    		_suit = suit;
    }
    public String toString()
    {	
        String[] value = {"Ace of ","" + _value + " of ","" + _value + " of ","" + _value + " of ","" + _value + " of ","" + _value + " of ","" + _value + " of ","" + _value + " of ",
        		"" + _value + " of ","" + _value + " of ","" + _value + " of ","Jack of ","Queen of ","King of "};
        String suits[] = {"Clubs","Diamonds","Hearts","Spades"};
        if(_value != -1 && _suit != -1)
        	return value[_value] + suits[_suit];
        return null;
    }
    public int getSuit()
    {
        return _suit;
    }
    public int getValue()
    {
        return _value;
    }

}
