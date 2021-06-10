package table;

import javax.crypto.CipherInputStream;
import javax.swing.*;

public class RunExampleTable1 {
    public static void main(String[] args) {

        ImageIcon imageIcon = new ImageIcon( "res/icon.png");
        JFrame jFrame = new JFrame("Form Biodata with Table");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new ExampleTable1().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}