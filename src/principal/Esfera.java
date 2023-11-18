/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

public class Esfera extends FiguraGeometrica {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
        calcularVolumen();
        calcularSuperficie();
    }

    private void calcularVolumen() {
        volumen = (4.0 / 3) * Math.PI * Math.pow(radio, 3);
    }

    private void calcularSuperficie() {
        superficie = 4 * Math.PI * radio * radio;
    }
}