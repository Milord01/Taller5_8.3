/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

public class Cilindro extends FiguraGeometrica {
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        calcularVolumen();
        calcularSuperficie();
    }

    private void calcularVolumen() {
        volumen = Math.PI * radio * radio * altura;
    }

    private void calcularSuperficie() {
        superficie = 2 * Math.PI * radio * (radio + altura);
    }
}