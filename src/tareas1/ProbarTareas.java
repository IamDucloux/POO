/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas1;

import java.time.LocalTime;

/**
 *
 * @author T-101
 */
public class ProbarTareas {

    public static void main(String[] args) {
        //Relojito1 t1 = new Relojito1();
        //t1.start();
        //Runnable r1 = new ProbarTareas();
        //Thread t1 = new Thread(r1);
        //t1.start();

        Thread t1 = new Thread(
                new Runnable() {
            @Override
            public void run() {
                while (true) {
                    LocalTime hora = LocalTime.now();
                    System.out.println(hora.toString());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                    }
                }
            }

        }
        );
        
        t1.start();

    }

    
}
