/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;
import java.io.*;
/**
 *
 * @author T-101
 */
public class Persistencia {
    public void guardar(String s) throws FileNotFoundException, IOException{
        File f=new File("Archivaldo");
        FileOutputStream fos= new FileOutputStream(f);
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.close();
        fos.close();
    }
}
