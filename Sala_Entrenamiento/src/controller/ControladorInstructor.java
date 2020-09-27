/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import model.Instructor;

/**
 *
 * @author Tony1
 */
public class ControladorInstructor implements iControlador{

    private final Collection<Instructor> instructores;
    
    protected ControladorInstructor(){
        instructores = new ArrayList();        
    }
    
    @Override
    public boolean agregar(Object registro) {
        return false;
    }  
    
    public boolean agregar(String idInstructor, String nombre, String apellido, 
            String celular, String correo, Date fechaNacimiento, boolean temporal, 
            Collection servicios) {
        instructores.add(new Instructor(idInstructor, nombre, apellido, celular, 
                correo, fechaNacimiento, temporal, servicios));        
        return true;
    }

    @Override
    public Object consultar(Object llave) {
        for (Instructor instruc : instructores)
            if(instruc.getId().equals(llave))
                return instruc;
        return null;
    }

    @Override
    public boolean modificar(Object registro) {
        return false;
    }

    @Override
    public boolean eliminar(Object registro) {
        return false;
    }
    
    protected Collection<Instructor> getInstructores(boolean temporal) {        
        if (temporal)
            return instructores;
        else{
            Collection<Instructor> resul = new ArrayList();
            for (Instructor inst : instructores)
                if (!inst.isTemporal())
                    resul.add(inst);
            return resul;
        }
    }
}
