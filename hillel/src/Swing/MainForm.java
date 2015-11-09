package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by OGlovatskaya on 09.11.2015.
 */
public class MainForm extends JFrame{
    private JPanel panel;
    private JLabel label;
    private JButton exitButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JTextField textField1;
    private JButton equalButton;
    private JButton plusButton;

    public MainForm(){
        setContentPane(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        exitButton.addActionListener(new QuitAction());

        /*ActionListener keyListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //anonimnij klass
                String command = e.getActionCommand();
                System.out.println(command + " key pressed");
            }
        };*/

        ActionListener keyListener = new CalculusListener(textField1);
        a1Button.addActionListener(keyListener);
        a2Button.addActionListener(keyListener);
        a3Button.addActionListener(keyListener);
        a4Button.addActionListener(keyListener);
        a5Button.addActionListener(keyListener);
        a6Button.addActionListener(keyListener);
        a7Button.addActionListener(keyListener);
        a8Button.addActionListener(keyListener);
        a9Button.addActionListener(keyListener);
        a0Button.addActionListener(keyListener);
        equalButton.addActionListener(keyListener);
        plusButton.addActionListener(keyListener);

        a1Button.setActionCommand("1");
        a2Button.setActionCommand("2");
        a3Button.setActionCommand("3");
        a4Button.setActionCommand("4");
        a5Button.setActionCommand("5");
        a6Button.setActionCommand("6");
        a7Button.setActionCommand("7");
        a8Button.setActionCommand("8");
        a9Button.setActionCommand("9");
        a0Button.setActionCommand("0");
        equalButton.setActionCommand("=");
        plusButton.setActionCommand("+");
    }

    public static void main(String[] args){
        new MainForm();
    }
}
