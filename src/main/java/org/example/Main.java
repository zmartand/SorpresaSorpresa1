package org.example;

import javax.swing.*;

public class Main extends JFrame {
    private JPanel panel1;
    private JPanel labelWindows;
    private JButton windowButtonButton;
    private JCheckBox windowsCheckboxCheckBox;

    public Main(){

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    windowButtonButton.addActionListener(e -> {
        System.out.println("Windows Button");
    });
    windowsCheckboxCheckBox.addActionListener(e -> {
        System.out.println("Windows Checkbox");
    });


    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
