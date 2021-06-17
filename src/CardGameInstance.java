import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class CardGameInstance {

    private final Pile[] tableauPile;
    private final Pile[] foundationPile;
    private final SolitaireSolver solver;

    public CardGameInstance() {
        tableauPile = new TableauPile[7];
        foundationPile = new FoundationPile[4];
        solver = new SolitaireSolver();

        for (int i = 0; i < tableauPile.length ; i++) {
            tableauPile[i] = new TableauPile();
        }

        for (int i = 0; i < foundationPile.length ; i++) {
            foundationPile[i] = new FoundationPile();
        }
    }

    public void startGame(List<String> stringCards) {

        for (int i = 0; i < stringCards.size(); i++) {

            String[] words = stringCards.get(i).split(" ");
            String suit = words[0].toUpperCase();

            Card cardIndex = new Card(Suit.valueOf(suit), Rank.setRank(words[1]));

            try
            {
                System.out.println(checkForDuplicates(tableauPile, cardIndex));
                if(!checkForDuplicates(tableauPile, cardIndex)) {
                    tableauPile[i].addCard(cardIndex);
                }

            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        System.out.println(solver.solveGame(tableauPile, foundationPile));
    }

    public boolean checkForDuplicates(Pile[] pile, Card card) {
        boolean duplicateFound = false;

        for (int i = 0; i < pile.length; i++) {
            for (int j = 0; j < pile[i].size() ; j++) {

                if(pile[i].getCard(j).toString().equals(card.toString())) {
                    duplicateFound = true;
                }
            }
        }
        return duplicateFound;
    }

    public Pile[] getTableauPile() {
        return tableauPile;
    }
}
