/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEsfera extends JFrame implements ActionListener {
    private JTextField txtRadio;
    private JButton btnCalcular;
    private JLabel lblVolumen, lblSuperficie;

    public VentanaEsfera() {
        setTitle("Cálculo de Esfera");
        setSize(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        // Etiqueta y campo de texto para el radio
        JLabel lblRadio = new JLabel("Radio:");
        lblRadio.setBounds(10, 10, 80, 25);
        add(lblRadio);

        txtRadio = new JTextField();
        txtRadio.setBounds(100, 10, 165, 25);
        add(txtRadio);

        // Botón para calcular
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 40, 165, 25);
        btnCalcular.addActionListener(this);
        add(btnCalcular);

        // Etiquetas para mostrar resultados
        lblVolumen = new JLabel("Volumen: ");
        lblVolumen.setBounds(10, 70, 200, 25);
        add(lblVolumen);

        lblSuperficie = new JLabel("Superficie: ");
        lblSuperficie.setBounds(10, 100, 200, 25);
        add(lblSuperficie);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            double radio = Double.parseDouble(txtRadio.getText());
            Esfera esfera = new Esfera(radio);

            lblVolumen.setText("Volumen: " + esfera.getVolumen());
            lblSuperficie.setText("Superficie: " + esfera.getSuperficie());
        }
    }
}