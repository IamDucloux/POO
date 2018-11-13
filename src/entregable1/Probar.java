/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregable1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class Probar {
    public static void main(String[] args) {
        try {
            Usuario u1=new Usuario("Juan", 25, 8000);
            PersistenciaUsuario p= new PersistenciaUsuario();
//            p.guardar(u1);
            for(Usuario u:p.leer()){
                System.out.println(u);
            }
        } catch (IOException ex) {
            Logger.getLogger(Probar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Probar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
