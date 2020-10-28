/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema8;

/**
 *
 * @author Tony1
 */

public class AbstractForja {
    public static void main(String[] args) {
        int tipoArma = 0;
        int daño = 15;
        int alcance = 5;
        
        Arma fabricarArma = AbstractArma.darArma(tipoArma, daño, alcance);
        
        System.out.println(fabricarArma.usarArma());
    }
}