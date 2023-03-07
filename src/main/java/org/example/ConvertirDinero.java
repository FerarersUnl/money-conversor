package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertirDinero extends JFrame {
    private JButton okBtn;
    private JButton cancelarBtn;
    private JTextField textField;
    private JLabel Error;
    private JPanel PanelConvert;

    public ConvertirDinero() {
        setContentPane(PanelConvert);
        setTitle("Conversor de Dinero");
        setSize(450, 300);
        setLocation(750, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int value = Integer.parseInt(textField.getText());
                } catch (Exception exception) {
                    Error.setVisible(true);
                }
            }
        });

        cancelarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
