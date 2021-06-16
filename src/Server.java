import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server {
    private ServerSocket socket;
    private static final Server instance = new Server();
    private final List<String> cardList = new ArrayList<>();
    private final CardGameInstance cardGame = new CardGameInstance();
    private boolean isActive;

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

                BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream()));

                String clientData = fromClient.readLine();
                System.out.println(clientData);
                String[] dataArray = clientData.split("_");

                Collections.addAll(cardList, dataArray);

            cardGame.startGame(cardList);

            } catch (IOException e) {
                System.out.println("Reconnected");
                isActive = false;

            }
        }
    }

    public static Server getInstance() {
        return instance;
    }

    public List<String> getCardList() {
        return cardList;
    }

    public boolean isActive() {
        return isActive;
    }
}
