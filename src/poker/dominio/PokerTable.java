package Poker.dominio;

import java.util.ArrayList;
import java.util.Scanner;


public abstract class PokerTable {

    // Variables

    private int pot = 0;
    public static ArrayList<Player> Players = new ArrayList<>();
    public static ArrayList<Card> tableCards = new ArrayList<>();

    // Getters an Setters

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }


    // Constructor

    // Methods
    public abstract void pot();
    public static void createPlayers() {
        Scanner inputPlayer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de jugadores: ");
        int quantityPlayers = inputPlayer.nextInt(); // indica cuantos jugadores

        for (int i = 0; i < quantityPlayers; i++) {
            System.out.print("Ingrese el nombre del jugador " + (i + 1) + ": ");
            String playerName = inputPlayer.next(); // nombre del jugador
            ArrayList<Card> hand = new ArrayList<Card>();
            Players.add(i, new Player(playerName, 10000));
            Player.setInGame(true);
        }
    }


}