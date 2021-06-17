import java.util.ArrayList;
import java.util.List;

public class CardMain {
    public static void main(String[] args) {
 /*
        Server server = Server.getInstance();

        do {
            server.connect();
        } while (true);*/


        List<String> cardList = new ArrayList<>();
        cardList.add("Hearts Ace");
        cardList.add("Spades 9");
        cardList.add("Hearts 2");
        cardList.add("Diamonds 8");
        cardList.add("Hearts King");
        cardList.add("Spades Jack");
        cardList.add("Diamonds 4");



        CardGameInstance play = new CardGameInstance();
        play.startGame(cardList);

    }
}
