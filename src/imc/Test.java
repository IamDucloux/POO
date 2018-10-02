/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author T-101
 */
public class Test {
    public static void main(String[] args) {
        Persona p=new Persona(76, 1.68f);
        Imc i=new Imc();
        i.CalcularImc(p);
        System.out.println("El Imc es "+i.valor);
    }
}
