/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.*;
import javax.swing.JLabel;

/**
 *
 * @author T-101
 */
public class Probar {

    public static void main(String[] args) {
        Opcion op1 = new Opcion("Ecaterror", false);
        Opcion op2 = new Opcion("Mizcalco", false);
        Opcion op3 = new Opcion("Kiev", true);
        Opcion op4 = new Opcion("Chalco", false);
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        Pregunta p1 = new Pregunta("¿Cual es la capital de Ucrania", opciones);
        
        Opcion op11 = new Opcion("Mizcalco", false);
        Opcion op12 = new Opcion("NezaYork", false);
        Opcion op13 = new Opcion("Minezota", false);
        Opcion op14 = new Opcion("CDMX", true);
        ArrayList<Opcion> opciones1 = new ArrayList<>();
        opciones1.add(op11);
        opciones1.add(op12);
        opciones1.add(op13);
        opciones1.add(op14);
        Pregunta p11 = new Pregunta("¿Cual es la capital de Mexico", opciones1);
        
        Opcion op21 = new Opcion("Anaya", false);
        Opcion op22 = new Opcion("Felipe Calderon", false);
        Opcion op23 = new Opcion("El peje", true);
        Opcion op24 = new Opcion("Margarita", false);
        ArrayList<Opcion> opciones2 = new ArrayList<>();
        opciones2.add(op21);
        opciones2.add(op22);
        opciones2.add(op23);
        opciones2.add(op24);
        Pregunta p21 = new Pregunta("¿Quien es el presidente electo de Mexico", opciones2);
        
        Opcion op31 = new Opcion("Tierra", false);
        Opcion op32 = new Opcion("Venus", false);
        Opcion op33 = new Opcion("Jupiter", false);
        Opcion op34 = new Opcion("Marte", true);
        ArrayList<Opcion> opciones3 = new ArrayList<>();
        opciones3.add(op31);
        opciones3.add(op32);
        opciones3.add(op33);
        opciones3.add(op34);
        Pregunta p3 = new Pregunta("¿Cual es el 4 planeta del Sistema Solar", opciones3);
        
        Opcion op41 = new Opcion("10", false);
        Opcion op42 = new Opcion("5", true);
        Opcion op43 = new Opcion("3", false);
        Opcion op44 = new Opcion("7", false);
        ArrayList<Opcion> opciones4 = new ArrayList<>();
        opciones4.add(op41);
        opciones4.add(op42);
        opciones4.add(op43);
        opciones4.add(op44);
        Pregunta p4 = new Pregunta("¿Cuantos Oceanos hay en la Tierra?", opciones4);
        
        Opcion op51 = new Opcion("2", true);
        Opcion op52 = new Opcion("3", false);
        Opcion op53 = new Opcion("7", false);
        Opcion op54 = new Opcion("1", false);
        ArrayList<Opcion> opciones5 = new ArrayList<>();
        opciones5.add(op51);
        opciones5.add(op52);
        opciones5.add(op53);
        opciones5.add(op54);
        Pregunta p5 = new Pregunta("¿En cuantos Oceanos tiene costa Mexico?", opciones5);
        
        Opcion op61 = new Opcion("Octubre", false);
        Opcion op62 = new Opcion("Diciembre", false);
        Opcion op63 = new Opcion("Noviembre", true);
        Opcion op64 = new Opcion("Julio", false);
        ArrayList<Opcion> opciones6 = new ArrayList<>();
        opciones6.add(op61);
        opciones6.add(op62);
        opciones6.add(op63);
        opciones6.add(op64);
        Pregunta p6 = new Pregunta("¿En que mes se celebra el dia de muertos?", opciones6);
        
        Opcion op71 = new Opcion("1810", true);
        Opcion op72 = new Opcion("1910", false);
        Opcion op73 = new Opcion("1821", false);
        Opcion op74 = new Opcion("1815", false);
        ArrayList<Opcion> opciones7 = new ArrayList<>();
        opciones7.add(op71);
        opciones7.add(op72);
        opciones7.add(op73);
        opciones7.add(op74);
        Pregunta p7 = new Pregunta("¿En que año empezo la independencia de Mexico?", opciones7);
        
        Opcion op81 = new Opcion("Washington DC", true);
        Opcion op82 = new Opcion("Nueva York", false);
        Opcion op83 = new Opcion("Minezota", false);
        Opcion op84 = new Opcion("CDMX", false);
        ArrayList<Opcion> opciones8 = new ArrayList<>();
        opciones8.add(op81);
        opciones8.add(op82);
        opciones8.add(op83);
        opciones8.add(op84);
        Pregunta p8 = new Pregunta("¿Cual es la capital de Estados Unidos?", opciones8);
        
        Opcion op91 = new Opcion("7", true);
        Opcion op92 = new Opcion("4", false);
        Opcion op93 = new Opcion("5", false);
        Opcion op94 = new Opcion("8", false);
        ArrayList<Opcion> opciones9 = new ArrayList<>();
        opciones9.add(op91);
        opciones9.add(op92);
        opciones9.add(op93);
        opciones9.add(op94);
        Pregunta p9 = new Pregunta("¿Cuantos continentes hay?", opciones9);

        ArrayList<Pregunta> preguntas = new ArrayList<>();
        preguntas.add(p1);
        preguntas.add(p11);
        preguntas.add(p21);
        preguntas.add(p3);
        preguntas.add(p4);
        preguntas.add(p5);
        preguntas.add(p6);
        preguntas.add(p7);
        preguntas.add(p8);
        preguntas.add(p9);
        for (Pregunta p : preguntas) {
            System.out.println(p.getTitulo());
            for (Opcion o : p.getOpciones()) {
                System.out.println(o.getTitulo());
            }
        }
    }
}
