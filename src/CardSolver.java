import java.util.ArrayList;

public class CardSolver {




    public ArrayList<Card>[] solveGame(ArrayList<Card>[] visibleCard) {

        System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
        for (int i = 0; i < visibleCard.length ; i++) {
            System.out.println(visibleCard[i].toString());
        }
        System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");

        for (int i = 0; i < visibleCard.length; i++) {

            for (int j = 0; j < visibleCard.length; j++) {


                        if (visibleCard[i].size()!=0 && visibleCard[j].size() != 0 ){

                            int movingCardFrom=visibleCard[i].get(0).getCardValue();
                            int movingCardTo=visibleCard[j].get(0).getCardValue()-1;
                            boolean cardsHaveDifferentColor = visibleCard[i].get(0).isCardRed()!=visibleCard[j].get(0).isCardRed();
                            boolean notOnTheSameRow = visibleCard[i]!=visibleCard[j];


                            if (movingCardFrom == movingCardTo && cardsHaveDifferentColor && notOnTheSameRow){
                                for (int l = 0; l < visibleCard[i].size();) {
                                    visibleCard[j].add(visibleCard[i].get(l));
                                    visibleCard[i].remove(l);

                                }
                            }
                        }





            }
        }

        return visibleCard;
    }


    private void checkIfPlacable(ArrayList A, Card card){



    }



}
