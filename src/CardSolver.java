import java.util.ArrayList;

public class CardSolver {




    public ArrayList<Card>[] solveGame(ArrayList<Card>[] visibleCard) {

        System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
        for (int i = 0; i < visibleCard.length ; i++) {
            System.out.println(visibleCard[i].toString());
        }
        System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");

        for (int i = 0;i<visibleCard.length; i++) {

            for (int j = 0; j < visibleCard.length; j++) {




                        int movingCardFrom=visibleCard[i].get(visibleCard[i].size()-1).getCardValue();
                        int movingCardTo=visibleCard[j].get(visibleCard[j].size()-1).getCardValue()-1;
                        boolean cardsHaveDifferentColor = visibleCard[i].get(visibleCard[i].size()-1).isCardRed()!=visibleCard[j].get(visibleCard[j].size()-1).isCardRed();
                        boolean notOnTheSameRow = visibleCard[i]!=visibleCard[j];


                        if (movingCardFrom == movingCardTo && cardsHaveDifferentColor && notOnTheSameRow){

                            for (int l = j; l < visibleCard[i].size();) {

                                visibleCard[j].add(visibleCard[i].get(l));
                                visibleCard[i].remove(l);


                            }




                        }




            }
        }

        return visibleCard;
    }


    private void checkIfPlacable(ArrayList A, Card card){



    }



}
