/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G02_Pareja_KennethyAnthony_Caso6_PatronMediator;

/**
 *
 * @author Tony1
 */
public abstract class Avion{
    private ITorreControl mediador;
    private String nombreAvion;
    private String ruta;
    private Boolean advertencia;
    
    public Avion(ITorreControl mediador, String nombreAvion, String ruta, Boolean advertencia){
        this.mediador = mediador;
        this.nombreAvion = nombreAvion;
        this.ruta = ruta;
        this.advertencia = advertencia;
    }

    public String getNombreAvion() {
        return nombreAvion;
    }

    public void setNombreAvion(String nombreAvion) {
        this.nombreAvion = nombreAvion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Boolean getAdvertencia() {
        return advertencia;
    }

    public void setAdvertencia(Boolean advertencia) {
        this.advertencia = advertencia;
    }

    public abstract void despegarAvion(Avion avion);
    public abstract void aterrizarAvion(Avion avion);
}
