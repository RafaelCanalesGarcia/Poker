package Poker.dominio;

import java.util.ArrayList;
import java.util.Random;

import static Poker.dominio.PokerTable.Players;

public class Deck {
    // Variables
    private static ArrayList<Card> deck;

    // Getters and Setters
    public static ArrayList<Card> getDeck() {
        return deck;
    }

    public static void setDeck(ArrayList<Card> deck) {
        Deck.deck = deck;
    }

    private void fill() { // (llenar) iteramos en cada array para introducir las distintas cartas al mazo.
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clovers"};
        String[] characters = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (String character : characters) {
                deck.add(new Card(character, suit));
            }
        }
    }

    public Deck() { // (mazo) instanciamos mazo como nuevo ArrayList y aplicamos el método (llenar)
        this.deck = new ArrayList<>();
        fill();
    }

    public void showDeck() { // (mostrarMazo) recorremos el ArrayList y mostramos carta por carta en orden.
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    private static void cut() { //cortar el mazo
        Random random = new Random();
        ArrayList<Card> newDeck = new ArrayList<>();
        int i = random.nextInt(deck.size() - 1);
        newDeck.addAll(deck.subList(i, deck.size()));
        newDeck.addAll(deck.subList(0, i));
        deck = newDeck;
    }

    public void shuffle() { // barajar con 2 cortes de mazo
        /* (barajar) instanciamos la clase Random para usar sus caracteristicas.
        iteramos por cada elemento del mazo(deck)
        damos a "j" un valor aleatorio con la caracteristica .nextInt(n)
        (n) indica nº aleatorio entre 0 inclusive hasta (n) exclusive
        creamos carta temportal con el valor de i con .get(i)
        hacemos .set para decidir donde se va a colocar la nueva carta (i) y con cual se va a reemplazar (j)
        */
        Random random = new Random();
        for (int i = deck.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temporary = deck.get(i);
            deck.set(i, deck.get(j));
            deck.set(j, temporary);
        }
        cut();
        cut();
    }

    public void removeFirstCard() { // descartar siguiente carta
        Card firstCard = deck.get(0);
        deck.remove(firstCard);
        deck.add(firstCard);
    }



    public void deal() { // reparte cartas a cada jugador

        for (Player player : Players) {
            player.addCard(deck.get(0));
            removeFirstCard();
            player.addCard(deck.get(0));
            removeFirstCard();
        }
    }

    public void drawcards(int times) { //saca x primeras cartas
        for (int i = 0; i < times; i++) {
            PokerTable.tableCards.add(deck.get(0));
            removeFirstCard();
        }
    }

}