/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregable1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class PersistenciaUsuario {
//    guardar(usuario a)
//    leer() --> usuario a
//    buscarPorId(int id)
//    borrar(int id)
//    actualizar(int id, campo a acualizar): guardar
    ArrayList<Usuario> usuarios;

    public PersistenciaUsuario() {
        usuarios=new ArrayList<>();
    }
    
    
    public void guardar(Usuario a) throws FileNotFoundException, IOException{
        usuarios.add(a);
        File f=new File("Archivaldo");
        FileOutputStream fos= new FileOutputStream(f);
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(a);
        oos.close();
        fos.close();
    }
    
    public ArrayList<Usuario> leer() throws FileNotFoundException, IOException{
        File f=new File("Archivaldo");
        FileInputStream fos= new FileInputStream(f);
        ObjectInputStream oos= new ObjectInputStream(fos);
        Usuario x=(Usuario) oos.readObject();
        oos.close();
        fos.close();
        return usuarios;
        
    }
}
