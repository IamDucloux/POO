/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregable1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        PersistenciaUsuario p= new PersistenciaUsuario();
        Usuario ian = new Usuario("ian", 21, 2000);
        p.guardar(ian);
        Usuario alex=new Usuario("Alex", 20, 2000);
        p.guardar(alex);
        Usuario pau=new Usuario("Pau", 20, 5000);
        p.guardar(pau);
//        for (Usuario x : p.leer()) {
//            System.out.println(x.getNombre()+" "+x.getEdad()+" "+x.getSueldo());
//        }
        System.out.println(p.BuscarPorId(2).getNombre()+" "+p.BuscarPorId(2).getEdad()+" "+p.BuscarPorId(2).getSueldo());
    }
}
