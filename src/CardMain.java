public class CardMain {
    public static void main(String[] args) {

        Server server = Server.getInstance();

        do {
            server.connect();
        } while (true);

    }
}
