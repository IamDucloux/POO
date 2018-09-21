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
        //x.radio=4;
        x.calcularArea();
        System.out.println(x.area);
    }
}
