/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

import java.util.Scanner;

/**
 *
 * @author T-101
 */

/**
 * Hacer una aplicacion que calcule el area de un circulo, dando la informacion del radio y la formula
 * r=radio
 * pi=3.1416
 * A=Area
 * @author T-101
 */
public class AplicacionArea {
    public static void main(String[] args) {
        
          Scanner teclado=new Scanner(System.in);
          int menu=0;
          float A=0;
          float pi=3.1416f;
          float r=0;
          float b=0;
          float h=0;
          do
          {
          System.out.println("Bienvenido, escoge un opcion:\n1.-Circulo\n2.-Rectangulo\n3.-Triangulo\n4.-Salir");
          menu=teclado.nextInt();
          switch(menu)
          {
              case 1: 
                  System.out.println("Ingrese el radio del circulo: ");
                  r=teclado.nextFloat();
                  A=pi*(r*r);
                  System.out.println("El Area del circulo es "+A);
                  menu=0;
                  break;
              case 2:
                  System.out.println("Ingrese los lados del rectangulo: ");
                  System.out.println("base: ");
                  b=teclado.nextFloat();
                  System.out.println("Altura: ");
                  h=teclado.nextFloat();
                  A=b*h;
                  System.out.println("El area del rectangulo es: "+A);
                  menu=0;
                  break;
              case 3:
                  System.out.println("Ingrese las medidas del triangulo:");
                  System.out.println("Base: ");
                  b=teclado.nextFloat();
                  System.out.println("Altura: ");
                  h=teclado.nextFloat();
                  A=b*h/2;
                  System.out.println("El area del triangulo es: "+A);
                  menu=0;
                  break;
              case 4:
                  System.out.println("Hasta luego ;)");
                  menu=4;
                    
          }
                  
          }while(menu==0);
    }
          
    
}
