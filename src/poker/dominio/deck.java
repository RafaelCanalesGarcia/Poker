package poker.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class deck {
    private ArrayList<card> deck;

    private void fill() { // (llenar) iteramos en cada array para introducir las distintas cartas al mazo.
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clovers"};
        String[] characters = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (String character : characters) {
                deck.add(new card(character, suit));
            }
        }
    }

    public deck() { // (mazo) instanciamos mazo como nuevo ArrayList y aplicamos el método (llenar)
        this.deck = new ArrayList<>();
        fill();
    }

    public void showDeck() { // (mostrarMazo) recorremos el ArrayList y mostramos carta por carta en orden.
        for (card card : deck) {
            System.out.println(card);
        }
    }

    private void cut() { /* (cortar) instanciamos la clase Random para usar sus caracteristicas
        creamos nuevoMazo en forma de ArrayList, instanciamos numero aleatorio dentro de los limites del mazo (i)
        addAll añadimos al final lo que indiquemos (subList (desde(incluido), hasta(excluido)))
        igualamos el original al nuevo mazo.
        */
        Random random = new Random();
        ArrayList<card> newDeck = new ArrayList<>();
        int i = random.nextInt(deck.size() - 1);
        newDeck.addAll(deck.subList(i, deck.size()));
        newDeck.addAll(deck.subList(0, i));
        deck = newDeck;
    }

    public void shuffle() {
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
            card temporary = deck.get(i);
            deck.set(i, deck.get(j));
            deck.set(j, temporary);
        }
        cut();
        cut();
    }

}
