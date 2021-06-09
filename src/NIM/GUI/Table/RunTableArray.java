package NIM.GUI.Table;

import javax.swing.*;

public class RunTableArray {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }
        JFrame jframe = new JFrame("Sorting Data Array");
        jframe.setContentPane(new TableArray().getRootPanel());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(500,400);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
}
