/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author 
 */
public class Cliente extends Persona{
    private eEstadoCliente estado;
    private Date fechaMatri;
    private Date fechaUltiPago;
    
    public Cliente() {
        super();
    }
    
    public Cliente(String id, String nombre, String apellido, String celular, 
            String correo, Date fechaNacimiento, eEstadoCliente estado, 
            Date fechaMatri, Date fechaUltiPago) {                
        super(id, nombre, apellido, celular, correo, fechaNacimiento);
        this.estado = estado;
        this.fechaMatri = fechaMatri;
        this.fechaUltiPago = fechaUltiPago;
    }

    public eEstadoCliente getEstado() {
        return estado;
    }

    public void setEstado(eEstadoCliente estado) {
        this.estado = estado;
    }

    public Date getFechaMatri() {
        return fechaMatri;
    }

    public void setFechaMatri(Date fechaMatri) {
        this.fechaMatri = fechaMatri;
    }

    public Date getFechaUltiPago() {
        return fechaUltiPago;
    }

    public void setFechaUltiPago(Date fechaUltiPago) {
        this.fechaUltiPago = fechaUltiPago;
    }

    @Override
    public String toString() {
        return id+" "+nombre+" "+apellido+'\n'+celular+" "+correo+" "+estado;
    }    
}
