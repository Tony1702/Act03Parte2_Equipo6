/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4_Builder;

/**
 *
 * @author josue
 */
public class Cliente {
    
    private String NIF;
    
    public Cliente(String pNIF){
        this.NIF = pNIF;
    }

    @Override
    public String toString() {
        return NIF;
    }
    
}
