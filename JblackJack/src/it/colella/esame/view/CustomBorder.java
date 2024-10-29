package it.colella.esame.view;
import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class CustomBorder extends AbstractBorder {

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        // Define border color and thickness
        g.setColor(Color.CYAN);
        g.drawRect(x, y, width - 1, height - 1);
    }
    
    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(2, 2, 2, 2); // Thickness of the border
    }
    
    
}


