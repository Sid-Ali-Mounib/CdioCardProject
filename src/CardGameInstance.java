import java.util.ArrayList;


public class CardGameInstance {

    public void startGame(){

        CardSolver Solver = new CardSolver();

        ArrayList<Card> visibleCard = new ArrayList<Card>();
        ArrayList<String> stringCards = new ArrayList<String>();


        //ArrayList<Card>[] lists =new ArrayList[7];
        Pile[] piles = new TableauPile[52];



        stringCards.add("Clubs 3");
        stringCards.add("Clubs 13");
        stringCards.add("Diamonds 12");
        stringCards.add("Hearts 8");
        stringCards.add("Spades 7");
        stringCards.add("Spades 5");
        stringCards.add("Hearts 4");
        stringCards.add("Spades 3");
        stringCards.add("Spades 13");
        stringCards.add("Hearts 6");
        stringCards.add("Hearts 2");
        stringCards.add("Spades 1");
        stringCards.add("Diamonds 8");
        stringCards.add("Clubs 7");
        stringCards.add("Clubs 5");
        stringCards.add("Diamonds 4");
        stringCards.add("Hearts 12");
        stringCards.add("Clubs 11");
        stringCards.add("Diamonds 10");
        stringCards.add("Spades 9");
        stringCards.add("Spades 11");
        stringCards.add("Hearts 10");
        stringCards.add("Clubs 9");
        stringCards.add("Diamonds 6");
        stringCards.add("Diamonds 2");
        stringCards.add("Clubs 1");
        stringCards.add("Hearts 3");
        stringCards.add("Hearts 11");
        stringCards.add("Clubs 12");
        stringCards.add("Clubs 10");
        stringCards.add("Hearts 7");
        stringCards.add("Hearts 5");
        stringCards.add("Clubs 4");
        stringCards.add("Hearts 9");
        stringCards.add("Hearts 13");
        stringCards.add("Clubs 6");
        stringCards.add("Clubs 2");
        stringCards.add("Hearts 1");
        stringCards.add("Clubs 8");
        stringCards.add("Diamonds 13");
        stringCards.add("Spades 12");
        stringCards.add("Spades 8");
        stringCards.add("Diamonds 7");
        stringCards.add("Diamonds 5");
        stringCards.add("Spades 4");
        stringCards.add("Diamonds 3");
        stringCards.add("Spades 6");
        stringCards.add("Spades 2");
        stringCards.add("Diamonds 1");
        stringCards.add("Spades 10");
        stringCards.add("Diamonds 9");
        stringCards.add("Diamonds 11");




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
