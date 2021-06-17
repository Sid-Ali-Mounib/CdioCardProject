import java.util.List;


public class CardGameInstance {

    private final Pile[] tableauPile;
    private final Pile[] foundationPile;
    private SolitaireSolver solver;

    public CardGameInstance() {
        tableauPile = new TableauPile[7];
        foundationPile = new FoundationPile[4];
        solver = new SolitaireSolver();
    }

    public void startGame(List<String> stringCards) {


        for (int i = 0; i < foundationPile.length ; i++) {
            foundationPile[i] = new FoundationPile();
        }


        for (int i = 0; i < stringCards.size(); i++) {

            String[] words = stringCards.get(i).split(" ");
            String suit = words[0].toUpperCase();


            Card cardIndex = new Card(Suit.valueOf(suit), Rank.setRank(words[1]));

            try {
                tableauPile[i] = new TableauPile();
                tableauPile[i].addCard(cardIndex);
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        System.out.println(solver.solveGame(tableauPile, foundationPile));
    }
}
