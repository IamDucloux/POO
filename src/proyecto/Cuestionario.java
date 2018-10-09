/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.*;

/**
 *
 * @author T-101
 */
public class Cuestionario {
    private ArrayList<Pregunta> Preguntas;

    /**
     * @return the Preguntas
     */
    public ArrayList<Pregunta> getPreguntas() {
        return Preguntas;
    }

    /**
     * @param Preguntas the Preguntas to set
     */
    public void setPreguntas(ArrayList<Pregunta> Preguntas) {
        this.Preguntas = Preguntas;
    }

    public Cuestionario(ArrayList<Pregunta> Preguntas) {
        this.Preguntas = Preguntas;
    }
    
}
