package Poker.dominio;

import java.util.ArrayList;



public class Player extends PokerTable {
    // Variables
    private ArrayList<Card> hand;
    private int maxBet = 200;
    private String name;
    private int money;

    private int currentBet = 0;
    private int toBet = 0;
    private boolean inGame;

    // Getters y Setters

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    public int getMaxBet() {
        return maxBet;
    }

    public void setMaxBet(int maxBet) {
        this.maxBet = maxBet;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getCurrentBet() {
        return currentBet;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setCurrentBet(int currentBet) {
        this.currentBet = currentBet;
    }

    public int getToBet() {
        return toBet;
    }

    public void setToBet(int toBet) {
        this.toBet = toBet;
    }

    public boolean isInGame() {
        return inGame;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }


    // Constructors
    public Player(String playerName, int money) {
        this.name = playerName;
        this.money = money;
        this.hand = new ArrayList<>();
    }

    // Methods
    public void bet(BetType type) {
        switch (type) {
            case MATCH:
                toBet = maxBet - currentBet;
                if (toBet + currentBet > money) {
                    System.out.println("No hay dinero suficiente, puedes hacer LEAVE o ALL_IN");
                } else {
                    currentBet = currentBet + toBet;
                }
                inGame = true;
                break;
            case DOUBLE:
                toBet = (maxBet * 2) - currentBet;
                if (toBet + currentBet > money) {
                    System.out.println("No hay dinero suficiente, puedes hacer LEAVE o ALL_IN");
                } else {
                    currentBet = currentBet + toBet;
                }
                inGame = true;
                break;
            case ALL_IN:
                toBet = money;
                currentBet = currentBet + toBet;
                inGame = true;
                break;
            case LEAVE:
                inGame = false;
                break;
        }
        maxBet = currentBet;
        pot();
        money = money - toBet;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    @Override
    public String toString() {
        return name + " have " + money + " and their hand: " + hand;
    }


    @Override
    public void pot() {
        setPot(getPot() + toBet);
    }
}