package flashcards;

import java.util.ArrayList;

import flashcards.cards.Card;

public class Deck implements java.io.Serializable {
    private String name;
    private ArrayList<Card> cards;
    private User owner;

    Deck(String name, User user, Records records) {
        this.name = name;
        this.cards = new ArrayList<Card>();
        this.owner = user;
        records.addDeck(this);
    }

    public String getName() {
        return this.name;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }
}