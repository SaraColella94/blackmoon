package it.colella.esame.view;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel{

	private Image back;
	
	public GamePanel() {
		setLayout(new GridLayout());
		setOpaque(false);
		uploadBackground();
	}
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
