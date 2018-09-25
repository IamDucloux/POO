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
public class Triangulo {
    float altura;
    float base;
    float area;

    public Triangulo(float altura, float base) {
        this.altura = altura;
        this.base = base;
    }
    
    void calcularArea()
    {
        area=(base*altura)/2;
    }
            
}
