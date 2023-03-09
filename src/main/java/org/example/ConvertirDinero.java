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
    private JComboBox opcionesBox;
    private JFormattedTextField newValue;

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
                    double value = Integer.parseInt(textField.getText());
                    int choice = opcionesBox.getSelectedIndex();
                    Integer finalValue;
                    switch (choice) {
                        case 0:
                            // Convert to Dollars
                            finalValue = (int) (value / 19.96);
                            break;
                        case 1:
                            finalValue = (int) (value / 18.95);
                            break;
                        case 2:
                            finalValue = (int) (value / 21.29);
                            break;
                        case 3:
                            finalValue = (int) (value / 0.13);
                            break;
                        case 4:
                            finalValue = (int) (value / 0.014);
                            break;
                        case 5:
                            finalValue = (int) (value / 0.056);
                            break;
                        case 6:
                            finalValue = (int) (value / 0.053);
                            break;
                        case 7:
                            finalValue = (int) (value / 0.047);
                            break;
                        case 8:
                            finalValue = (int) (value / 7.62);
                            break;
                        case 9:
                            finalValue = (int) (value / 73.50);
                            break;
                    }

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
