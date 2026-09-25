package org.example.projava.chapterOne;

import javax.swing.*;

public class SampleForm {

    public static void  main(String[] args) {
        var frame = new JFrame("test");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var text1 = new JTextField();
        frame.add("South", text1);

        var text2 = new JTextField();
        frame.add("South", text2);

        var button = new JButton("Capital letter");
        frame.add(button);

        button.addActionListener(ae ->
                text2.setText(text1.getText().toUpperCase()));

        frame.setVisible(true);
    }
}
