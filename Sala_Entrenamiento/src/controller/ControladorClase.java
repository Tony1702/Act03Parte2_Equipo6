/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.ArrayList;
import java.util.Collection;
import model.Clase;
import model.eDiaSemana;
import model.Horario;
import model.Instructor;
import model.Servicio;

/**
 *
 * @author Tony1
 */
public class ControladorClase {
    private Collection<Clase> clases;

    public ControladorClase() {
        this.clases = new ArrayList<Clase>();
    }

    public Collection<Clase> getClases() {
        return clases;
    }

    public void setClases(Collection<Clase> clases) {
        this.clases = clases;
    }
    
    public String actualizarCalendario(eDiaSemana dia, Horario horario, int duracion, Instructor instructor, Servicio servicio){
        return " ";
    };
    
    public String listarClase(eDiaSemana dia){
        return " ";
    }
    
}
