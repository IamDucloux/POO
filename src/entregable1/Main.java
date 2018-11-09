/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregable1;

import java.io.IOException;

/**
 *
 * @author T-101
 */
public class Main {
    public static void main(String[] args) throws IOException {
        PersistenciaUsuario p= new PersistenciaUsuario();
        Usuario ian = new Usuario("ian", 21, 2000);
        p.guardar(ian);
        Usuario alex=new Usuario("Alex", 20, 2000);
        p.guardar(alex);
    }
}
