package poker.dominio;

import java.util.Scanner;
import java.util.ArrayList;

import static poker.dominio.PokerTable.maxBet;

public class GameRules {
    public static void gameStart() {
        boolean gameInProgress = true;
        int currentPlayer = 0;
        while (gameInProgress){
            for (int i = 0; i < PokerTable.Players.size(); i++) {
                if(Player.inGame) {
                    System.out.println("Tu mano: " + Player.hand);
                    System.out.println("Apuesta máxima: " + maxBet);
                }
            }
        }
    }

    public void turn() {

    }
}