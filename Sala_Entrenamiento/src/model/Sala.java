/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Collection;

/**
 *
 * @author
 */
public class Sala {
    private String id;
    private String nombre;
    private int capacidad;
    private float mensualidad;
    private int aforo;
    private Collection<Horario> horario;

    public Sala(String id, String nombre, int capacidad, float mensualidad, 
            int aforo, Collection<Horario> horario) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.mensualidad = mensualidad;
        this.aforo = aforo;
        this.horario = horario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Horario> getHorario() {
        return horario;
    }

    public void setHorario(Collection<Horario> horario) {
        this.horario = horario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(float mensualidad) {
        this.mensualidad = mensualidad;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }    
}
