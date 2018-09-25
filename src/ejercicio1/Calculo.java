/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author T-101
 */
public class Calculo {
    public static void main(String[] args) {
        Persona p=new Persona(78,  1.80f);
        Imc c=new Imc();
        System.out.println(  c.calcularImc(p));
    }
}
