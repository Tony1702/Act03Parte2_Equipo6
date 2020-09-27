/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collection;
import model.Servicio;

/**
 *
 * @author Tony1
 */
public class ControladorServicio implements iControlador{
    
    private final Collection<Servicio> servicios;
    
    protected ControladorServicio(){
        servicios = new ArrayList();        
    }

    public Collection<Servicio> listarServicios() {
        return servicios;
    }

    @Override
    public boolean agregar(Object registro) {
        return false;
    }
    
    public boolean agregar(String idServicio, String descripcion){        
        servicios.add(new Servicio(idServicio, descripcion));
        return true;
    }
    
    @Override
    public Object consultar(Object llave) {
        for (Servicio serv : servicios)
            if(serv.getCodigo().equals(llave))
                return serv;
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
}
