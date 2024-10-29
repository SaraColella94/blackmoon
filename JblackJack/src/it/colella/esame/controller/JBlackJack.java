package it.colella.esame.controller;

import java.util.List;
import java.util.Scanner;

import it.colella.esame.model.Deck;
import it.colella.esame.model.Game;
import it.colella.esame.model.Player;
import it.colella.esame.view.Frame;

public class JBlackJack {

	public static void main(String[] args) {
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * 
		 * Player player1 = new Player("Giorgio", 0, 0);
		 * 
		 * Player player2 = new Player("Gianny", 0, 0);
		 * 
		 * Player player3 = new Player("Paolo", 0, 0);
		 * 
		 * Game game = new Game(player1, player2, player3);
		 * 
		 * boolean go = true;
		 * 
		 * while (go == true) {
		 * 
		 * System.out.println("***Do you want to play BlackMoon?***");
		 * System.out.println("\nPress 1 to game");
		 * System.out.println("Press 0 to exit");
		 * 
		 * int chose = Integer.parseInt(scan.nextLine());
		 * 
		 * switch (chose) { case 0: go = false; break; case 1: play(game, scan); break;
		 * } }
		 * 
		 * 
		 */
		
		 //Frame frame = new Frame(); 
		
	}

	private static void play(Game game, Scanner scan) {

		game.startGame();

		Player[] players = game.getPlayers();

		
		Player player1 = players[0];

		

		boolean go = game.gameIsOver();
		boolean choice = true;

		while (!go && choice) {

			game.turnGame(player1);

			System.out.println("Dealer: " + game.getDealer().getFirstCard() + ", " + game.getDealer().getHand());
			for (Player player : players) {
				System.out.println(player.getName() + ": " + player.getHand());
			}
			go = game.gameIsOver();
			choice = readChose(scan,player1);
		}

		List <Player> winners = game.winner();

		for (Player player : winners) {
				System.out.println("The winner is " + player.getName()+ " sum: " + player.sum());
				System.out.println(player.getHand());
		}
		if(winners.isEmpty()) System.out.println("No winner");
		
		System.out.println("Dealer: "+game.getDealer().getHand()+" sum: " + game.getDealer().sum());
		clear(game);
	}
	
	private static void clear(Game game) {
		Player[] players = game.getPlayers();
		for(Player p : players) {
			p.getHand().clear();
		}
	}

	private static boolean readChose(Scanner scan, Player player1) {
		
		System.out.println("\n" + player1.getName());
		System.out.println("\nPress 0 to Stay");
		System.out.println("Press 1 to Carry on");
		int chose = Integer.parseInt(scan.nextLine());

		if (chose == 1)
			return true;
		else
			return false;
	}
}
