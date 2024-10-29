package it.colella.esame.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class GameMenu extends JPanel {

	private Frame frame;
	private Image back;
	private JButton rulesButton;
	private JButton playButton;
	private JButton Acount;

	public GameMenu(Frame frame) {
		this.frame = frame;
		setLayout(new BorderLayout());
		setOpaque(false);
		uploadBackground();

		rulesButton = new JButton("Rules");
		playButton = new JButton("Play");
		
		Font font = new Font("Times New Roman",Font.BOLD,  24);
		
		playButton.setFont(font);
		rulesButton.setFont(font);

		rulesButton.setPreferredSize(new Dimension(600, 66));
		playButton.setOpaque(false);
		
		
		Color color = new Color(0x123456);
		rulesButton.setForeground(color);
		playButton.setForeground(color);
		
		/* playButton.setBorder(new CustomBorder()); */
		
		playButton.setPreferredSize(new Dimension(600, 66));
		rulesButton.setOpaque(false);
		
		/*
		 * Listener
		 */
		playButton.addActionListener(e -> frame.showMode());;
		
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setOpaque(false);
		
		buttonPanel.add(playButton);
		buttonPanel.add(rulesButton);

		add(buttonPanel, BorderLayout.SOUTH);
	}

	

	private void uploadBackground() {
		try {
			back = ImageIO.read(getClass().getResource("/gioco/backMenu.png"));
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
