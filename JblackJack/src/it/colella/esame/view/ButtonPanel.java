package it.colella.esame.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.TextArea;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{
	private JButton hit;
	private JButton stand;
	
	public ButtonPanel() {
		setLayout(new GridBagLayout());
		setPreferredSize(new Dimension(1783, 100));
		
		hit = new JButton(getAvatar3Icon());
		stand = new JButton(getAvatar3Icon());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx= 1.0;
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		add(hit,gbc);
		
		gbc.gridx = 1;
		
		add(hit,gbc);
	}
	
	private ImageIcon getAvatar3Icon() {
        String path = "/gioco/RectangleStand.png";
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
