package it.colella.esame.model;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Playable {

	private boolean cardIsCovered;
	private Card firstCard;
	private List<Card> hand;

	public Dealer() {
		this.cardIsCovered = true;
		this.firstCard = null;
		this.hand = new ArrayList<Card>();
	}
	/*
	 * the dealer need a method to uncovered the his first covered card
	 */
	public void unCovered() {
		if (this.cardIsCovered == true && this.firstCard != null) {
			setCardIsCovered(false);
			this.hand.add(firstCard);
		}
	}

	

	public Card getFirstCard() {
		if (cardIsCovered == true) {
			return null;
		}

		return firstCard;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setFirstCard(Card firstCard) {
		this.firstCard = firstCard;
	}

	public boolean isCardIsCovered() {
		return cardIsCovered;
	}

	public void setCardIsCovered(boolean cardIsCovered) {
		this.cardIsCovered = cardIsCovered;
	}

	@Override
	public int sum() {
		
		unCovered();
		
		int sum = hand.stream()
				.mapToInt(Card::getPoint)
				.sum();

		if (hand.contains(Number.ACE) && sum < 9) {
			sum += 10;
		}

		return sum;
	}

}
