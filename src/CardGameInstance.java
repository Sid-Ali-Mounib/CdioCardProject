import java.util.List;


public class CardGameInstance {

    private final Pile[] piles;
    private SolitaireSolver solver;

    public CardGameInstance() {
        piles = new TableauPile[7];
        solver = new SolitaireSolver();
    }

    public void startGame(List<String> stringCards) {

        for (int i = 0; i < stringCards.size(); i++) {

            String[] words = stringCards.get(i).split(" ");
            String suit = words[0].toUpperCase();


            Card cardIndex = new Card(Suit.valueOf(suit), Rank.setRank(words[1]));

            try {
                piles[i] = new TableauPile();
                piles[i].addCard(cardIndex);
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        solver.solveGame(piles);
    }

    public Pile[] getPiles() {
        return piles;
    }
}
