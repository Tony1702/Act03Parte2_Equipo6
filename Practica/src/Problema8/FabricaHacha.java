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
public class FabricaHacha  extends AbstractArma implements Arma{
    private double golpeSangrando;
    
    public FabricaHacha(int daño, int alcance) {
        super(daño, alcance);
        this.golpeSangrando = daño * 3 - alcance * 0.8;
    }

    @Override
    public String usarArma() {
        return ("Estas blandiendo el hacha, esto se debe a que el enemigo es grande, haces " + golpeSangrando + " de sangrado");
    }
}
