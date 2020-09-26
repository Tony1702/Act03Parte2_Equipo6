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
public class Horario {
    
    public String dia;
    public String horarioInicio;
    public String tiempoFinal;

    public Horario(String dia, String horarioInicio, String tiempoFinal) {
        this.dia = dia;
        this.horarioInicio = horarioInicio;
        this.tiempoFinal = tiempoFinal;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getTiempoFinal() {
        return tiempoFinal;
    }

    public void setTiempoFinal(String tiempoFinal) {
        this.tiempoFinal = tiempoFinal;
    }
}
