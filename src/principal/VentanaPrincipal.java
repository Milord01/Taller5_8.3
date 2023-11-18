/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private JButton btnCilindro, btnEsfera, btnPiramide;

    public VentanaPrincipal() {
        setTitle("Calculadora de Figuras Geométricas");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        btnCilindro = new JButton("Cilindro");
        btnCilindro.setBounds(50, 50, 100, 30);
        btnCilindro.addActionListener(this);
        add(btnCilindro);

        btnEsfera = new JButton("Esfera");
        btnEsfera.setBounds(150, 50, 100, 30);
        btnEsfera.addActionListener(this);
        add(btnEsfera);

        btnPiramide = new JButton("Pirámide");
        btnPiramide.setBounds(250, 50, 100, 30);
        btnPiramide.addActionListener(this);
        add(btnPiramide);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCilindro) {
            VentanaCilindro ventanaCilindro = new VentanaCilindro();
            ventanaCilindro.setVisible(true);
        } else if (e.getSource() == btnEsfera) {
            VentanaEsfera ventanaEsfera = new VentanaEsfera();
            ventanaEsfera.setVisible(true);
        } else if (e.getSource() == btnPiramide) {
            VentanaPiramide ventanaPiramide = new VentanaPiramide();
            ventanaPiramide.setVisible(true);
        }}}
