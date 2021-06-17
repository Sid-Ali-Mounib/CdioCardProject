import java.util.*;

public class CardMain {
    public static void main(String[] args) {

        /*
        String s = "Hearts 2_Spades 5_Hearts 2_";
        String[] data = s.split("_");
        Set<String> strings = new HashSet<>();

        Collections.addAll(strings, data);

        System.out.println(strings.toString());

         */



        Server server = Server.getInstance();

        do {
            server.connect();
        } while (true);


    }
}
