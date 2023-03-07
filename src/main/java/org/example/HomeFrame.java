package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeFrame extends JFrame {
    private JButton cancelarBtn;
    private JButton okBtn;
    private JComboBox opcionesBox;
    private JPanel homePanel;

    public HomeFrame() {
        setContentPane(homePanel);
        setTitle("Inicio");
        setSize(450, 150);
        setLocation(750, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valorSeleccionado = opcionesBox.getSelectedIndex();
                if (valorSeleccionado == 0 ) {
                    new ConvertirDinero();
                }
                else {
                    new ConvertirTemperatura();
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

    public static void main(String[] args) {
        HomeFrame homeFrame = new HomeFrame();
    }
}
