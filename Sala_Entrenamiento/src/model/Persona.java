/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tony1
 */
public class Persona {
    
    protected String id;
    protected String nombre;
    protected String celular;
    protected String correo;
    protected Date fechaNacimiento;
    
    public Persona(String pId, String pNombre, String pCelular, String pCorreo, Date pFechaNacimiento) {
        id = pId;
        nombre = pNombre;
        celular = pCelular;
        correo = pCorreo;
        fechaNacimiento = pFechaNacimiento;        
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
