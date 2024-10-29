package it.colella.esame.model;

import java.util.ArrayList;
import java.util.List;

public class Player implements Playable {

	private String name;
	private int level;
	private int coin;
	private List<Card> hand;
	
	public Player(String name, int level, int coin) {
		this.name = name;
		this.level = level;
		this.coin = coin;
		this.hand = new ArrayList<Card>();
	}
	/*
	 * Method to give a partial sum, I'll give a specification in a method in game
	 */
	
	public int sum() {
		int sum = hand.stream()
					.mapToInt(Card::getPoint)
					.sum();
		
		if (hand.contains(Number.ACE) && sum < 9){
			sum += 10;
		}
			
		return sum;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public int getCoin() {
		return coin;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
}
