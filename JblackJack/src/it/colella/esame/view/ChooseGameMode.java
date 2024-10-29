package it.colella.esame.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ChooseGameMode extends JPanel{

	private Frame frame;
	private Image back;
	private JButton OnePlayer;
	private JButton TwoPlayers;
	private JButton ThreePlayers;
	private CardLayout cardLayout;
	

	public ChooseGameMode(Frame frame) {
		this.frame = frame;
		setLayout(new GridBagLayout());
		setOpaque(false);
		uploadBackground();

		OnePlayer = new JButton("Play Alone");

		TwoPlayers = new JButton("Play with a Computer");
		ThreePlayers = new JButton("Play with two Computer");
		
		Font font = new Font("Times New Roman",Font.BOLD,  24);
		
		TwoPlayers.setFont(font);
		OnePlayer.setFont(font);
		ThreePlayers.setFont(font);

		
		
		
		
		Color color = new Color(0, 26, 79);
		OnePlayer.setForeground(color);
		TwoPlayers.setForeground(color);
		ThreePlayers.setForeground(color);
		/* playButton.setBorder(new CustomBorder()); */
		
		OnePlayer.setPreferredSize(new Dimension(500, 66));
		TwoPlayers.setPreferredSize(new Dimension(500, 66));
		ThreePlayers.setPreferredSize(new Dimension(500, 66));
		

		JPanel choosePanel = new JPanel();
		choosePanel.setOpaque(false);
		choosePanel.add(OnePlayer);
		choosePanel.add(TwoPlayers);
		choosePanel.add(ThreePlayers);
		
		

		add(choosePanel);
	}

	/*
	 * private void showChooseGameMode(){ ChooseGameMode }
	 */

	private void uploadBackground() {
		try {
			back = ImageIO.read(getClass().getResource("/gioco/Back2.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (back != null)
			g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
	}

}
