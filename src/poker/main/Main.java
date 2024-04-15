package poker.main;

import poker.dominio.BetType;
import poker.dominio.Deck;
import poker.dominio.Player;
import poker.dominio.PokerTable;

public class Main {

    public static void main(String[] args) {
        Deck poker = new Deck();
        poker.showDeck();
        System.out.println("_________________________________________________");
        poker.shuffle();
        poker.showDeck();
        Player Player1 = new Player("Player-1");
        Player Player2 = new Player("Player-2");

        System.out.println(PokerTable.maxBet); // 100
        System.out.println(PokerTable.pot); // 0
        System.out.println("________________");
        System.out.println("MATCH");
        Player1.bet(BetType.MATCH);
        System.out.println("APUESTA MAXIMA: " + PokerTable.maxBet); //100
        System.out.println("BOTE: " + PokerTable.pot); // 100
        System.out.println("________________");
        System.out.println("DOUBLE");
        Player2.bet(BetType.DOUBLE);
        System.out.println("APUESTA MAXIMA: " + PokerTable.maxBet); // 200
        System.out.println("BOTE: " + PokerTable.pot);  // 300
        System.out.println("________________");
        System.out.println("DOUBLE");
        Player1.bet(BetType.DOUBLE);
        System.out.println("APUESTA MAXIMA: " + PokerTable.maxBet); //400
        System.out.println("BOTE: " + PokerTable.pot); // 600
        System.out.println("________________");
        System.out.println("DOUBLE");
        Player2.bet(BetType.DOUBLE);
        System.out.println("APUESTA MAXIMA: " + PokerTable.maxBet); //800
        System.out.println("BOTE: " + PokerTable.pot); // 1200
        System.out.println("________________");
        System.out.println("ALL-IN");
        Player1.bet(BetType.ALL_IN);
        System.out.println("APUESTA MAXIMA: " + PokerTable.maxBet); //10000
        System.out.println("BOTE: " + PokerTable.pot); // 10800
    }
}