package Poker.dominio;

public class Card {
    // Variables
    private String character;
    private String suit;

    //Getters and Setters
    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    // Methods
    @Override
    public String toString() {
        return character + " of " + suit;
    }

    public Card(String character, String suit) {
        this.character = character;
        this.suit = suit;
    }
}