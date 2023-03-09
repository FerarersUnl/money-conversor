package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class ConvertirDinero extends JFrame {
    private JButton okBtn;
    private JButton cancelarBtn;
    private JTextField textField;
    private JLabel Error;
    private JPanel PanelConvert;
    private JComboBox opcionesBox;
    private JLabel valorFinal;
    private JLabel mostrarConversion;
    private JFormattedTextField newValue;

    public ConvertirDinero() {
        setContentPane(PanelConvert);
        setTitle("Conversor de Dinero");
        setSize(450, 300);
        setLocation(750, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double value = Integer.parseInt(textField.getText());
                    int choice = opcionesBox.getSelectedIndex();
                    Double finalValue = null;
                    DecimalFormat df = new DecimalFormat("0.00");
                    switch (choice) {
                        case 0:
                            finalValue = value / 19.96;
                            break;
                        case 1:
                            finalValue = value / 18.95;
                            break;
                        case 2:
                            finalValue = value / 21.29;
                            break;
                        case 3:
                            finalValue = value / 0.13;
                            break;
                        case 4:
                            finalValue = value / 0.014;
                            break;
                        case 5:
                            finalValue = value / 0.056;
                            break;
                        case 6:
                            finalValue = value / 0.053;
                            break;
                        case 7:
                            finalValue = value / 0.047;
                            break;
                        case 8:
                            finalValue = value / 7.62;
                            break;
                        case 9:
                            finalValue = value / 73.50;
                            break;
                    }
                    mostrarConversion.setVisible(true);
                    valorFinal.setText(df.format(finalValue));
                } catch (Exception exception) {
                    Error.setVisible(true);
                }
            }
        });
    }
}
