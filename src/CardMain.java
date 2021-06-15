public class CardMain {
    public static void main(String[] args) {

        CardGameInstance game = new CardGameInstance();

        do {
            game.startGame();
        } while (Server.getInstance().isActive());
    }
}
