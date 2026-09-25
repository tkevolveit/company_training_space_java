package org.example.projava.chapterOne;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class SampleDraw {

    public static void main(String[] args) {

        // Create frame
        var frame = new JFrame("drawing");
        frame.setVisible(true);

        // Add label
        var label = new JLabel("test");
        frame.add(label);

        // Set graphic
        var image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        var graphic = image.createGraphics();

        // Set icon
        label.setIcon(new ImageIcon(image));

        // close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Auto resize frame
        frame.pack();

        // draw line
        graphic.drawLine(0, 0, 600, 400);

        // display line
//        label.repaint();

        // add color
        graphic.setColor(java.awt.Color.RED);
        graphic.fillRect(300, 200, 150, 100);

        // display rectangle
        label.repaint();
    }
}
