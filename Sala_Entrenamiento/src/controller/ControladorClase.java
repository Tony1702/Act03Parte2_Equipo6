/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.ArrayList;
import java.util.Collection;
import model.Clase;
import model.Cliente;
import model.eDiaSemana;
import model.Horario;
import model.Instructor;
import model.Servicio;
import model.eTiempo;
import model.Sala;

/**
 *
 * @author Tony1
 */
public class ControladorClase implements iControlador{
    
    private final Collection<Clase> clases;

    protected ControladorClase() {        
        this.clases = new ArrayList();        
    }

    @Override
    public boolean agregar(Object registro) {
        return false;
    }
    
    public boolean agregar(String idClase, Object sala, Object instructor, 
            Object servicio, int aforoClase, eDiaSemana dia, String horaInicio, 
            eTiempo tiempoInicio, String horaFin, eTiempo tiempoFin){        
                
        Horario horClase = new Horario(dia, horaInicio, tiempoInicio, horaFin, 
                tiempoFin);
                              
        Clase clase = new Clase(idClase, (Sala)sala, (Instructor)instructor,
                (Servicio)servicio, aforoClase, horClase);
        clases.add(clase);
        return true;
    }
    
    @Override
    public Object consultar(Object llave) {
        for (Clase clase : clases)
            if (clase.getIdClase().equals(llave))
                return clase;
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
    
    protected boolean incluirClienteAClase(Object llave, Object cliente){       
        for (Clase clase : clases)
            if (clase.getIdClase().equals(llave))
                if (clase.getAsistencia().size() < clase.getAforoClase()){                    
                    clase.getAsistencia().add((Cliente)cliente);
                    return true;
                }
        return false;
    }
            
    protected String actualizarCalendario(eDiaSemana dia, Horario horario, 
            int duracion, Instructor instructor, Servicio servicio){
        return " ";
    }
    
    protected String listarClase(eDiaSemana dia){
        return " ";
    }           
}
