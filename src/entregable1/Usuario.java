/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregable1;
import java.io.Serializable;

/**
 *
 * @author T-101
 */
public class Usuario implements Serializable{
    private String nombre;
    private int edad;
    private float sueldo;

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + '}';
    }

   
    public Usuario(){
        nombre="";
        edad=0;
        sueldo=0;
    }

    public Usuario(String nombre, int edad, float sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
}
