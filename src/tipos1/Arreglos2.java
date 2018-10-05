/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos1;

/**
 *
 * @author T-101
 */
public class Arreglos2 {
    public static void main(String[] args) {
        int x;
        int x2[]=new int[3];
        System.out.println(x2[0]);
        String hola[]={"Ya", "casi", "nos", "vamos"};
        for (int i = 0; i < hola.length; i++) {
            System.out.println(hola[i]);
        }
        //Ciclo For Mejorad0
        for(String y:hola){
            System.out.println(y);
        }
    }
}
