package NIM.GUI;

import javax.swing.*;

public class RunFormBiodata {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Form Biodata");
        jframe.setContentPane(new FormBiodata().getRootPanel());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setSize(500,400);
        jframe.setVisible(true);
    }
}
