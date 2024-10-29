package it.colella.esame.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Deck{

	private List<Card> deck;

	public Deck() {
		this.deck = new ArrayList<Card>();
		Collections.addAll(deck, Card.values());
		deckShuffle();
	}

	public void deckShuffle() {
		Collections.shuffle(deck);
	}
	
	
	
	public Card dealCard() {
		if (deck.isEmpty()) {
			throw new IllegalStateException ("The deck is Empty");
		}
		
		Card card = deck.getFirst();
		deck.removeFirst();
		
		return card;
	}
}
