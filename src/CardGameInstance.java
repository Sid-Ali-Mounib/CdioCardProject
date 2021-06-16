import java.util.ArrayList;


public class CardGameInstance {

    public void startGame(){

        CardSolver Solver = new CardSolver();

        ArrayList<Card> visibleCard = new ArrayList<Card>();
        ArrayList<String> stringCards = new ArrayList<String>();


        //ArrayList<Card>[] lists =new ArrayList[7];
        Pile[] piles = new TableauPile[7];



        stringCards.add("Clubs 3");
        stringCards.add("Clubs King");
        stringCards.add("Diamonds Queen");
        stringCards.add("Hearts 8");
        stringCards.add("Spades 7");
        stringCards.add("Clubs Jack");
        stringCards.add("Hearts 5");




    for (int i = 0; i < stringCards.size() ; i++) {

        String[] words = stringCards.get(i).split(" ");
        String suit = words[0].toUpperCase();


        Card cardIndex = new Card(Suit.valueOf(suit),Rank.setRank(words[1]));

        piles[i]=new TableauPile();
        piles[i].addCard(cardIndex);


    }

    Solver.solveGame(piles);


}




    private int findValueOfCard(String card){
        return Integer.parseInt(card);
    }

}
