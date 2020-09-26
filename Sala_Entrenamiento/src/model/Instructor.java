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
public class Instructor extends Persona{   
    private boolean temporal;
    private Collection<Servicio> servicios;

    public Instructor(boolean temporal, Collection<Servicio> servicios) {        
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
