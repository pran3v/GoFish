import junit.framework.TestCase;

public class CardTest extends TestCase {
	
	Card c;
	public void testCard() {
		c = new Card(1,1);
	}

	public void testToString() {
		c = new Card(1,1);
		assertTrue(c.toString().compareTo("1 of Diamonds")==0);
	}

	public void testGetSuit() {
		c = new Card(1,1);
		assertTrue(c.getSuit()==1);
	}

	public void testGetValue() {
		c = new Card(1,1);
		assertTrue(c.getValue()==1);
	}

}
