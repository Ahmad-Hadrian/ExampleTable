package Jtable;

import table.ExampleTable1;

import javax.swing.*;

public class runJtable {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("contohjtable");
        jFrame.setContentPane(new ExampleTable1().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500 ,400);
        jFrame.setVisible(true);

    }
}

