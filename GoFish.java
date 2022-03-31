import java.util.Scanner;

public class GoFish
{
    public static Scanner userData = new Scanner(System.in);

    public static void main(String[]args)
    {
        boolean reStart = true;
        int menu;
        do
        {
            System.out.println("\n1) Test Deck Hand Class\n 2) Play Go Fish\n 3) Exit");
            menu = userData.nextInt();
            if(menu == 1) 
            	testDecks();
            else if(menu == 2) {
            	new GoFishHand();
            }
            else if(menu == 3)
            	reStart = false;

        }while(reStart);
        System.out.println("Exiting!");
    }


    public static void testDecks()
    {
        boolean repTest = true;
        int hand;
        Deck fullDeck;
        Deck emptyHand;
        do
        {
            System.out.println("Which Deck would you like to manipulate?\n" +
                    "[1] Empty Hand\n[2] Full Deck\nEnter the Corresponding number");
            hand = userData.nextInt();
            if(hand == 1) {
            	emptyHand = new Deck();
                repTest = testDeck(emptyHand);
            }else if(hand == 2) {
            	fullDeck = new Deck();
                fullDeck.fillDeck();
                repTest = testDeck(fullDeck);
            }
        }while(repTest);
    }

    public static boolean testDeck(Deck deck)
    {
        Card temp;
        int menu;
        boolean repDeckTest = true;
        do
        {
            System.out.println("[1] Insert Card\n[2] Delete Card Value\n[3] Delete Random Card\n" +
                    "[4] Test number times a specific value Occurs in Hand\n" +
                    "[5] Print Total number of Cards in Deck\n" +
                    "[6] Display Entire Deck hand\n" +
                    "[7] Change/Restart Decks\n[8] Exit Test");
            menu = userData.nextInt();
            if(menu == 1) {
            	 int suit, value;
                 System.out.println("Please enter the Card ID you'd like to insert\n" +
                         "Both Value and Suit are represented by Integers\nSuits:\n" +
                         "\t1 = Clubs\n\t2 = Diamonds\n\t3 = Hearts\n\t4 = Spades\n" +
                         "Enter the Integer Corresponding to the Suit");
                 suit = userData.nextInt();
                 System.out.println("Okay, now enter the Value for the Card as an integer.");
                 value = userData.nextInt();
                 Card insert = new Card(value, suit);
                 deck.insertCard(insert);
                 System.out.println("Card inserted");
            }
            else if(menu == 2) {
            	  int deleteVal;
                  System.out.println("Which card Value would you like to search and Delete?\n" +
                          "Enter the integer Representation of the Value");
                  deleteVal = userData.nextInt();
                  Card deleteCard;
                  deleteCard = deck.deleteValue(deleteVal);
                  if(deleteCard == null)
                      System.out.println("Card not found.");
                  else
                      System.out.println("Card Deleted: " + deleteCard);
            }
            else if(menu == 3){
            	 Card randomDelete;
                 randomDelete = deck.deleteAnyCard();
                 if(randomDelete == null)
                     System.out.println("Empty Hand");
                 else
                     System.out.println("Card deleted : " + randomDelete);
            }
            else if(menu == 4){
            	System.out.println("Which value would you like Search for?");
                int searchVal = userData.nextInt();
                System.out.println("That value occurs " + deck.getCount(searchVal) +
                        " times in the Deck Hand");
            }
            else if(menu == 5){
            	System.out.println("Total number of Cards in Deck : " + deck.getSize());
            }
            else if(menu == 6){
            	System.out.println(deck);
            }
            else if(menu == 7 || menu == 8){
            	repDeckTest = false;
            }
        }while(repDeckTest);
        return true;
    }
}
