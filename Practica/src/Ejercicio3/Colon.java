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
public abstract class Colon {
    // Referencia al Implementador
    Convertidor convertidor;
    String nombre;
    int valor;
    
    // --------------------------
    
    public Convertidor getImplementador() {
        return this.convertidor;
    }
    
    // --------------------------
    public void setImplementador( Convertidor convertidor ) {
        this.convertidor = convertidor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
       
    // --------------------------
    // Método a implementar por las clases que hereden
    public abstract void obtener();
}
