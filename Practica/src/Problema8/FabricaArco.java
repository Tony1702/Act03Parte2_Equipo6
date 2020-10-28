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
public class FabricaArco extends AbstractArma implements Arma{
    private final double golpeCritico;
    
    public FabricaArco(int daño, int alcance) {
        super(daño, alcance);
        this.golpeCritico = daño + 2 * alcance;
    }

    @Override
    public String usarArma() {
        return ("Estas tensando el arco, debido a que el enemigo esta lejos de ti, haces " + golpeCritico + " de golpe critico");
    }
}
