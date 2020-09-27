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
    private String idClase;
    private Sala sala;
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
    public Clase(String idClase, Sala sala, Instructor intructor, 
            Servicio servicio, int aforoClase, Horario horario) {            
        this.idClase = idClase;
        this.sala = sala;
        this.intructor = intructor;
        this.servicio = servicio;
        this.aforoClase = aforoClase;
        this.horario = horario;
        this.asistencia = new ArrayList();        
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

    public String getIdClase() {
        return idClase;
    }

    public void setIdClase(String idClase) {
        this.idClase = idClase;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
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

    @Override
    public String toString() {        
        return idClase +" "+ sala.getNombre() +" "+ intructor.getNombre() +" "+ 
                intructor.getApellido()+'\n'+ servicio.getDescripcion() +" "+ 
                horario.toString() + '\n' + asistencia.size() +"/"+ aforoClase;
    }    
}
