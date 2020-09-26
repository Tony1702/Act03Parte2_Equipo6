/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Tony1
 */
public class Clase {
    private Instructor intructor;
    private Servicio servicio;
    private int aforoClase;
    private Collection<Cliente> asistencia;
    private Horario horario;

    /**
     * 
     * @param intructor
     * @param servicio
     * @param aforoClase
     * @param horario 
     */
    public Clase(Instructor intructor, Servicio servicio, int aforoClase, Horario horario) {
        this.intructor = intructor;
        this.servicio = servicio;
        this.aforoClase = aforoClase;
        this.asistencia = new ArrayList<Cliente>();
        this.horario = horario;
    }

    /**
     * 
     * @return 
     */
    public Instructor getIntructor() {
        return intructor;
    }

    /**
     * 
     * @return 
     */
    public Servicio getServicio() {
        return servicio;
    }

    public int getAforoClase() {
        return aforoClase;
    }

    /**
     * 
     * @return 
     */
    public Collection<Cliente> getAsistencia() {
        return asistencia;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setIntructor(Instructor intructor) {
        this.intructor = intructor;
    }

    /**
     * 
     * @param servicio 
     */
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    /**
     * 
     * @param aforoClase 
     */
    public void setAforoClase(int aforoClase) {
        this.aforoClase = aforoClase;
    }

    public void setAsistencia(Collection<Cliente> asistencia) {
        this.asistencia = asistencia;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    
    
    
}
