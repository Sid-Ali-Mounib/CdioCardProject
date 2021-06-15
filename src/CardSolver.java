import java.util.ArrayList;

public class CardSolver {


    public void solveGame(Pile[] rowCard) {

        System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
        for (int i = 0; i < rowCard.length ; i++) {
            System.out.println(rowCard[i].getCards().toString());
        }
        System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");

        for (int i = 0; i < rowCard.length; i++) {

            for (int j = 0; j < rowCard.length; j++) {

                if (rowCard[i].size()!=0 && rowCard[j].size() != 0 ){

                    int movingCardFrom=rowCard[i].getCard(0).getRank().getValue();
                    int movingCardTo=rowCard[j].getCard(rowCard[j].size() - 1).getRank().getValue()-1;
                    boolean cardsHaveDifferentColor = rowCard[i].getCard(0).isRed()!=rowCard[j].getCard(rowCard[j].size() - 1).isRed();
                    boolean notOnTheSameRow = rowCard[i]!=rowCard[j];

                    if (movingCardFrom == movingCardTo && cardsHaveDifferentColor && notOnTheSameRow){
                        for (int l = 0; l < rowCard[i].size();) {
                            rowCard[j].addCard(rowCard[i].getCard(l));
                            rowCard[i].removeCard(l);

                        }
                    }
                }
            }
        }

        for (Pile pile : rowCard) {
            System.out.println(pile.getCards().toString());
        }
    }
}


