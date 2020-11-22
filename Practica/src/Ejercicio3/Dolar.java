/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Tony1
 */
public class Dolar implements Convertidor
{
    public Dolar() {
    }

    // --------------------------

    @Override
    public void mostrarMoneda(int valor) {
        double dolar = valor * 0.0016;
        System.out.println("Se reciben " + valor + " colones y se devuelven " + dolar + " dolares");
    }
}
