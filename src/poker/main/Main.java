package Poker.main;

import Poker.dominio.*;


public class Main {

    public static void main(String[] args) {
        Deck poker = new Deck();
        poker.getDeck();
        /*PokerTable.createPlayers();
        System.out.println(Players);
        poker.shuffle();
        poker.deal();
        System.out.println(Players);
        poker.drawcards(3);
        System.out.println(tableCards);
        poker.drawcards(1);
        System.out.println(tableCards);
        poker.drawcards(1);
        System.out.println(tableCards);



        System.out.println("_________________________________________________");
        poker.showDeck();
        Crupier Crupier = new Crupier();
        Crupier.deal();
        poker.shuffle();
        poker.showDeck();
        Player Player1 = new Player("Player-1");
        Player Player2 = new Player("Player-2");


        Player1.bet(BetType.LEAVE);
        System.out.println("maxBet: " + PokerTable.maxBet); // 100
        System.out.println("pot: " + PokerTable.pot); // 0
        System.out.println("________________");
        System.out.println("MATCH");
        Player1.bet(BetType.MATCH);
        System.out.println("maxBet: " + PokerTable.maxBet); //100
        System.out.println("pot: " + PokerTable.pot); // 100
        System.out.println("________________");
        System.out.println("DOUBLE");
        Player2.bet(BetType.DOUBLE);
        System.out.println("maxBet: " + PokerTable.maxBet); // 200
        System.out.println("pot: " +PokerTable.pot);  // 300
        System.out.println("________________");
        System.out.println("DOUBLE");
        Player1.bet(BetType.DOUBLE);
        System.out.println("maxBet: " + PokerTable.maxBet); //400
        System.out.println("pot: " +PokerTable.pot); // 600
        System.out.println("________________");
        System.out.println("DOUBLE");
        Player2.bet(BetType.DOUBLE);
        System.out.println("maxBet: " + PokerTable.maxBet); //800
        System.out.println("pot: " + PokerTable.pot); // 1200

        System.out.println("________________");
        System.out.println("DOUBLE");
        Player1.bet(BetType.DOUBLE);
        System.out.println("maxBet: " + PokerTable.maxBet); //1600
        System.out.println("pot: " + PokerTable.pot); // 2400
        System.out.println("________________");
        System.out.println("MATCH");
        Player2.bet(BetType.MATCH);
        System.out.println("maxBet: " + PokerTable.maxBet); //1600
        System.out.println("pot: " + PokerTable.pot); // 3200
        System.out.println("________________");
        System.out.println("ALL_IN");
        Player2.bet(BetType.ALL_IN);
        System.out.println("maxBet: " + PokerTable.maxBet); //10000
        System.out.println("pot: " + PokerTable.pot); // 11600

*/
    }
}