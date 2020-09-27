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
    
    private eDiaSemana dia;
    private String horaInicio;
    private eTiempo tiempoInicio;
    private String horaFinal;
    private eTiempo tiempoFinal;

    public Horario(eDiaSemana dia, String horaInicio, eTiempo tiempoInicio, String horaFinal, eTiempo tiempoFinal) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.tiempoInicio = tiempoInicio;
        this.horaFinal = horaFinal;
        this.tiempoFinal = tiempoFinal;
    }

    public eDiaSemana getDia() {
        return dia;
    }

    public void setDia(eDiaSemana dia) {
        this.dia = dia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public eTiempo getTiempoInicio() {
        return tiempoInicio;
    }

    public void setTiempoInicio(eTiempo tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public eTiempo getTiempoFinal() {
        return tiempoFinal;
    }

    public void setTiempoFinal(eTiempo tiempoFinal) {
        this.tiempoFinal = tiempoFinal;
    }

    @Override
    public String toString() {
        return dia +": "+ horaInicio +" "+ tiempoInicio +" - "+ 
                horaFinal + " " + tiempoFinal;
    }  
}
