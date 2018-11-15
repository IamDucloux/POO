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
    
    
    public void guardar(Usuario a) throws FileNotFoundException, IOException, ClassNotFoundException{
        File f=new File("usuarios");
        if (f.exists()) usuarios=leer();
        FileOutputStream fos= new FileOutputStream(f);
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        usuarios.add(a);
        oos.writeObject(usuarios);
        oos.close();
        fos.close();
    }
    
    public ArrayList<Usuario> leer() throws FileNotFoundException, IOException, ClassNotFoundException{
        File f=new File("usuarios");
        FileInputStream fos= new FileInputStream(f);
        ObjectInputStream oos= new ObjectInputStream(fos);
        usuarios =(ArrayList<Usuario>) oos.readObject();
        oos.close();
        fos.close();
        return usuarios;
        
    }
    
    public Usuario buscarPorId(int index) throws FileNotFoundException, IOException, ClassNotFoundException{
        File f=new File("usuarios");
        FileInputStream fos= new FileInputStream(f);
        ObjectInputStream oos= new ObjectInputStream(fos);
        usuarios =(ArrayList<Usuario>) oos.readObject();
        oos.close();
        fos.close();
        return usuarios.get(index);
    }
    
    public void borrar(int index) throws FileNotFoundException, ClassNotFoundException, IOException{
        File f=new File("usuarios");
        if (f.exists()) usuarios=leer();
        FileInputStream fos= new FileInputStream(f);
        ObjectInputStream oos= new ObjectInputStream(fos);
        usuarios =(ArrayList<Usuario>) oos.readObject();
        usuarios.remove(index);
        oos.close();
        fos.close();
    }
    
    public void actualizar(int index, Usuario a) throws FileNotFoundException, IOException, ClassNotFoundException {
        File f=new File("usuarios");
        if (f.exists()) usuarios=leer();
        FileOutputStream fos= new FileOutputStream(f);
        ObjectOutputStream oos= new ObjectOutputStream(fos);
/*      ***No Necesario***
        if("null".equals(a.getNombre())) a.setNombre(usuarios.get(index).getNombre());
        if(a.getEdad()==0) a.setEdad(usuarios.get(index).getEdad());
        if(a.getSueldo()==0) a.setSueldo(usuarios.get(index).getSueldo());
*/        
        usuarios.set(index, a);
        oos.close();
        fos.close();
    }
}
