/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Collection;
import java.util.Date;

/**
 *
 * @author 
 */
public class Instructor extends Persona{   
    private boolean temporal;
    private Collection<Servicio> servicios;
    
    public Instructor() {
        super();
    }
    
    public Instructor(String id, String nombre, String apellido, String celular, String correo, Date fechaNacimiento, boolean temporal, Collection<Servicio> servicios) {        
        super(id, nombre, apellido, celular, correo, fechaNacimiento);
        this.temporal = temporal;
        this.servicios = servicios;
    }  

    public boolean isTemporal() {
        return temporal;
    }

    public void setTemporal(boolean temporal) {
        this.temporal = temporal;
    }

    public Collection<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(Collection<Servicio> servicios) {
        this.servicios = servicios;
    }
    
}
