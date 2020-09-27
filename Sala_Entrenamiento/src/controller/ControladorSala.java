/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Collection;
import java.util.ArrayList;
import model.Horario;
import model.Sala;
import model.eDiaSemana;
import model.eTiempo;

/**
 *
 * @author Tony1
 */
class ControladorSala implements iControlador{

    private final Collection<Sala> salas;
    
    protected ControladorSala(){
        this.salas = new ArrayList();      
    }
    
    @Override
    public boolean agregar(Object registro) {
        return false;
    }

    public boolean agregar(String idSala, String nombreSala, int capacidadMax, 
            float mensualidad, int aforo, String horaInicio, eTiempo tiempoInicio, 
            String horaFin, eTiempo tiempoFin){
        
        if (capacidadMax > aforo){
            Collection<Horario> hSemanal = new ArrayList();
            for (eDiaSemana dia : eDiaSemana.values())
                hSemanal.add(new Horario(dia, horaInicio, tiempoInicio, horaFin, 
                    tiempoFin));

            Sala salaNueva = new Sala(idSala, nombreSala, capacidadMax, mensualidad, 
                    aforo,hSemanal);
            salas.add(salaNueva);
            return true;
        }
        return false;
    }
    
    @Override
    public Object consultar(Object llave) {
        for (Sala sala : salas)
            if(sala.getId().equals(llave))
                return sala;
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
    
    protected int obtenerAforo(Object llave){
        for (Sala sala : salas)
            if(sala.getId().equals(llave))
                return sala.getAforo();
        return 0;
    }
}
