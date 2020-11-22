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
public class Euro implements Convertidor {
    public Euro() {
    }

    // --------------------------

    @Override
    public void mostrarMoneda(int valor) {
        double euro = valor * 0.0014;
        System.out.println("Se reciben " + valor + " colones y se devuelven " + euro + " euros");
    }
}
