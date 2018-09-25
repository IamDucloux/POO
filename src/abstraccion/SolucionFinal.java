/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package abstraccion;
/**
 *
 * @author T-101
 */
public class SolucionFinal {
    public static void main(String[] args) {
        Circulo x=new Circulo(4);
        x.calcularArea();
        System.out.println(x.area);
        Triangulo y=new Triangulo(2, 3);
        y.calcularArea();
        System.out.println(y.area);
        Rectangulo z=new Rectangulo(5, 6);
        z.calcularArea();
        System.out.println(z.area);
    }
}
