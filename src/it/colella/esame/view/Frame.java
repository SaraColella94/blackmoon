package it.colella.esame.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {

	private GameMenu menu;
	private ChooseGameMode mode;
	
	private CardLayout cL;
	private JPanel cP;
	
	private ButtonPanel buttons;
	private GamePanel game;
	
	public Frame() {
		super("Black Moon");
		setLayout(new BorderLayout());
		
		cL = new CardLayout();
		cP = new JPanel(cL);
		buttons = new ButtonPanel();
		game = new GamePanel();
		
		menu = new GameMenu(this);
		mode = new ChooseGameMode(this);
		
		cP.add(menu, "menu");
		cP.add(mode,"mode");
		
		add(cP, BorderLayout.CENTER);
		
		setSize(1783, 1002);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		ImageIcon image = new ImageIcon("gioco/Logo.png");
		setIconImage(image.getImage());
	}
	

	public void showMenu() {
		cL.show(cP, "menu");
	}

	public void showMode() {
		cL.show(cP, "mode");
	}
	
	public void showGamePanel() {
		remove(cP);
		add(game, BorderLayout.CENTER);
		add(buttons, BorderLayout.SOUTH);
		setSize(1783, 1002);
		setResizable(false);
		setLocationRelativeTo(null);
		repaint();
		
	}
	
}
