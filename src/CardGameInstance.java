import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CardGameInstance {


    public void startGame(){

        CardSolver Solver = new CardSolver();

        List<Card> visibleCard = new ArrayList<Card>();
        Server server = Server.getInstance();
        server.connect();
        //ArrayList<String> stringCards = new ArrayList<String>();
        List<String> stringCards = server.getCardList();

        //ArrayList<Card>[] lists =new ArrayList[7];
        Pile[] piles = new TableauPile[7];


   /*
    stringCards.add("Hearts 6");
    stringCards.add("Spades 10");
    stringCards.add("Hearts 4");
    stringCards.add("Diamonds 3");
    stringCards.add("Spades 4");
    stringCards.add("Diamonds 5");
    stringCards.add("Hearts 9");
    */

        for (int i = 0; i < stringCards.size() ; i++) {

            String[] words = stringCards.get(i).split(" ");
            String suit = words[0].toUpperCase();


            Card cardIndex = new Card(Suit.valueOf(suit),Rank.setRank(words[1]));

            piles[i]=new TableauPile();
            piles[i].addCard(cardIndex);
        }

        Solver.solveGame(piles);
    }


    /*
    private final CardSolver solver;
    private final Server server = Server.getInstance();
    private Pile[] piles = new TableauPile[7];

    public CardGameInstance() {
        solver = new CardSolver();
        server.connect();

        for (int i = 0; i < 7; i++) {
            piles[i] = new TableauPile();
        }
    }

    public void startGame() {


        List<String> stringCards = server.getCardList();


        for (int i = 0; i < stringCards.size(); i++) {

            String[] words = stringCards.get(i).split(" ");
            String suit = words[0].toUpperCase();


            Card cardIndex = new Card(Suit.valueOf(suit), Rank.setRank(words[1]));

            piles[i].addCard(cardIndex);

        }
        solver.solveGame(piles);
    }

     */
}
