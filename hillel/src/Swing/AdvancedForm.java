package Swing;

import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by OGlovatskaya on 12.11.2015.
 */
public class AdvancedForm extends JFrame {
    private JPanel panel;
    private JButton exitButton;
    private JList list;
    private JButton addButton;
    private JTextField textField;

    public AdvancedForm() {
        setContentPane(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        exitButton.addActionListener(new ActionListener() {
            private int exitCode = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "" +
                                "Are you sure?",
                        "Exit confirmation",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);

                if (result == JOptionPane.OK_OPTION) {
                    System.exit(exitCode);
                }
            }
        });

        DefaultListModel<String> model = new DefaultListModel<String>();
        list.setModel(model);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                textField.setText("");

                model.add(model.size(), text);
            }
        });

        exitButton.addActionListener(e -> System.out.println("exit" + e.getActionCommand()));
        //exitButton.addActionListener((ActionEvent e) -> System.out.println("exit" + e .getActionCommand()));
    }

    public static void main(String[] args) {
        new AdvancedForm();
    }
}
