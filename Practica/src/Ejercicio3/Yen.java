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
public class Yen implements Convertidor {
    public Yen() {
    }

    // --------------------------

    @Override
    public void mostrarMoneda(int valor) {
        double yen = valor * 0.17;
        System.out.println("Se reciben " + valor + " colones y se devuelven " + yen + " yenes");
    }
}
