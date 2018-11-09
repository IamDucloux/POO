/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class Main {
    public static void main(String[] args) {
        try {
            Persistencia p=new Persistencia();
//            p.guardar("Hola Mundo prros");
//            System.out.println("Mensaje Guardado");
            System.out.println(p.leer());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
