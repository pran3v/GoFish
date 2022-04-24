import junit.framework.TestCase;

public class TestDeck extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testDeleteValue() {
		Deck d = new Deck();
		assertTrue(d.deleteValue(1)==null);
	}

	public void testDeleteAnyCard() {
		Deck d = new Deck();
		assertTrue(d.deleteAnyCard()==null);
	}

	public void testGetCount() {
		Deck d = new Deck();
		assertTrue(d.getSize() == 0);
	}

	public void testGetSize() {
		Deck d = new Deck();
		assertTrue(d.getSize() == 0);
	}

}
