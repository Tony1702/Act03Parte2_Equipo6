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
public class FabricaEspada  extends AbstractArma implements Arma{
    private double golpeRapido;
    
    public FabricaEspada(int daño, int alcance) {
        super(daño, alcance);
        this.golpeRapido = daño * 1.5 + alcance;
    }

    @Override
    public String usarArma() {
        return ("Estas empuñando la espada, esto se debe a que el enemigo es agil, haces " + golpeRapido + " de golpe rapido");
    }
}