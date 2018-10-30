/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author T-101
 */
public class Validaciones {
    public static void validarNumero(float valor)throws ValorNoNegativoException{
        if(valor<0)throw new ValorNoNegativoException();
    }
}
