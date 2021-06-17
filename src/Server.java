import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class Server {
    private ServerSocket socket;
    private static final Server instance = new Server();
    private final CardGameInstance cardGame = new CardGameInstance();

    private Server() {
        try {
            socket = new ServerSocket(8000);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void connect() {

        while (true) {
            try {
                Socket client = socket.accept();
                List<String> cardList = new ArrayList<>();

                BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream()));

                String clientData = fromClient.readLine();
                System.out.println(clientData);
                String[] dataArray = clientData.split("_");

                Collections.addAll(cardList, dataArray);

                cardGame.startGame(cardList);

            } catch (IOException e) {
                System.out.println("Reconnected");
            }
        }
    }

    public static Server getInstance() {
        return instance;
    }
}
