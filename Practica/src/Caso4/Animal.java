/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso4;

/**
 *
 * @author Kenneth
 */
public class Animal {
    private int id;
    private String especie;
    private String nombre;

    public Animal(int id, String especie, String nombre) {
        this.id = id;
        this.especie = especie;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getEspecie() {
        return especie;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return id +" "+ especie +" "+ nombre;
    }
    
    
    
}
