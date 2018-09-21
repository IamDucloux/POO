/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package abstraccion;
/**
 *
 * @author T-101
 */
public class Circulo {
    float radio;
    float area;
    void calcularArea()
    {
        area=(float) (Math.PI*Math.pow(radio, 2));
    }
            
}
