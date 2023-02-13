package org.example;

import javax.swing.*;

public class Main extends JFrame {
    private JPanel panel1;
    private JLabel labelWindows;
    private JButton windowsButton;
    private JCheckBox windowsCheckBox;
    private JLabel labelMacOS;
    private JCheckBox macOSCheckBox;
    private JButton macOSButton;

    public Main(){

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    windowsButton.addActionListener(e -> {
        System.out.println("Windows Button");
    });
    windowsCheckBox.addActionListener(e -> {
        System.out.println("Windows Checkbox");
    });
    macOSButton.addActionListener(e -> {
        System.out.println("MacOS Button");
    });
    macOSCheckBox.addActionListener(e -> {
        System.out.println("MacOS Checkbox");
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
