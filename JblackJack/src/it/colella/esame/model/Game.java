package it.colella.esame.model;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private Dealer dealer;
	private Player[] players;
	private Deck deck;
	private static int turn;

	/*
	 * the game been initialized for 1,2 or 3 players
	 */

	public Game(Player player) {
		this.players = new Player[1];
		players[0] = player;
		this.dealer = new Dealer();
		this.deck = new Deck();
		this.turn = 0;
	}

	public Game(Player player, Player player2) {
		this.players = new Player[2];
		players[0] = player;
		players[1] = player2;
		this.dealer = new Dealer();
		this.deck = new Deck();
		this.turn = 0;
	}

	public Game(Player player, Player player2, Player player3) {
		this.players = new Player[3];
		players[0] = player;
		players[1] = player2;
		players[2] = player3;
		this.dealer = new Dealer();
		this.deck = new Deck();
		this.turn = 0;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public Player[] getPlayers() {
		return players;
	}

	public static int getTurn() {
		return turn;
	}

	public void startGame() {

		deck.deckShuffle();

		Card card2 = deck.dealCard();
		if (card2 != null) {
			dealer.setFirstCard(card2);
			dealer.setCardIsCovered(true);
		}
		for (Player player : players) {
			Card card = deck.dealCard();
			player.getHand().add(card);
		}

	}

	/*
	 * Give a card
	 */

	
	public void turnGame(Player player) {
		if(player.sum()<21) {
		Card card = deck.dealCard();
		player.getHand().add(card);

		Card card2 = deck.dealCard();
		dealer.getHand().add(card2);
		turn++;
		}
	}
	/*
	 * Return a boolean value about
	 */

	public boolean gameIsOver() {
		for (int i = 0; i < players.length; i++) {
			Playable winner = players[i];
			int playerSum = players[i].sum();
			if (playerSum > 21)
				return true;
		}
		return false;
	}

	public List<Player> winner() {
		List<Player> winners = new ArrayList<Player>();

		for (int i = 0; i < players.length; i++) {
			if (players[i] != null && players[i].sum() <= 21
					&& (players[i].sum() == 21 || players[i].sum() >= dealer.sum())) {
				players[i].setCoin(players[i].getCoin() + 5);
				players[i].setLevel(players[i].getLevel() + 1);

				winners.add(players[i]);
			}
		}
		return winners;
	}
}
