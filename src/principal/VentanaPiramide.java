/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPiramide extends JFrame implements ActionListener {
    private JTextField txtBase, txtAltura, txtApotema;
    private JButton btnCalcular;
    private JLabel lblVolumen, lblSuperficie;

    public VentanaPiramide() {
        setTitle("Cálculo de Pirámide");
        setSize(350, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        // Etiqueta y campo de texto para la base
        JLabel lblBase = new JLabel("Base:");
        lblBase.setBounds(10, 10, 80, 25);
        add(lblBase);

        txtBase = new JTextField();
        txtBase.setBounds(100, 10, 165, 25);
        add(txtBase);

        // Etiqueta y campo de texto para la altura
        JLabel lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(10, 40, 80, 25);
        add(lblAltura);

        txtAltura = new JTextField();
        txtAltura.setBounds(100, 40, 165, 25);
        add(txtAltura);

        // Etiqueta y campo de texto para el apotema
        JLabel lblApotema = new JLabel("Apotema:");
        lblApotema.setBounds(10, 70, 80, 25);
        add(lblApotema);

        txtApotema = new JTextField();
        txtApotema.setBounds(100, 70, 165, 25);
        add(txtApotema);

        // Botón para calcular
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 100, 165, 25);
        btnCalcular.addActionListener(this);
        add(btnCalcular);

        // Etiquetas para mostrar resultados
        lblVolumen = new JLabel("Volumen: ");
        lblVolumen.setBounds(10, 130, 200, 25);
        add(lblVolumen);

        lblSuperficie = new JLabel("Superficie: ");
        lblSuperficie.setBounds(10, 160, 200, 25);
        add(lblSuperficie);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            double base = Double.parseDouble(txtBase.getText());
            double altura = Double.parseDouble(txtAltura.getText());
            double apotema = Double.parseDouble(txtApotema.getText());
            Piramide piramide = new Piramide(base, altura, apotema);

            lblVolumen.setText("Volumen: " + piramide.getVolumen());
            lblSuperficie.setText("Superficie: " + piramide.getSuperficie());
        }
    }
}