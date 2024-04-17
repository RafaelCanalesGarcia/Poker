package poker.dominio;
import java.util.ArrayList;
import java.util.Scanner;

public class PokerTable {
    public static int maxBet = 100;
    public static int pot = 0;
    public static ArrayList<Player> Players = new ArrayList<>();

    public static ArrayList<Card> tableCards = new ArrayList<>();

    public PokerTable () {
    }
    public static void createPlayers() {
        Scanner inputPlayer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de jugadores: ");
        int quantityPlayers = inputPlayer.nextInt();

        for (int i = 0; i < quantityPlayers; i++) {
            System.out.print("Ingrese el nombre del jugador " + (i + 1) + ": ");
            String playerName = inputPlayer.next(); // Leer el nombre del jugador

            Players.add(i, new Player(playerName));
        }
    }
}