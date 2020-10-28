/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema8;

/**
 *
 * @author Tony1
 */
public class AbstractArma {
    public final static int HACHA = 0;
    public final static int ESPADA = 1;
    public final static int ARCO = 2;
    
    protected int daño;
    protected int alcance;

    public AbstractArma(int daño, int alcance) {
        this.daño = daño;
        this.alcance = alcance;
    }
    
    public static Arma darArma(int tipoArma, int daño, int alcance){
        switch (tipoArma) {
            case HACHA:
                return new FabricaHacha(daño, alcance);
            case ESPADA:
                return new FabricaEspada(daño, alcance);
            case ARCO:
                return new FabricaArco(daño, alcance);
        }     
        return null;
    }
}