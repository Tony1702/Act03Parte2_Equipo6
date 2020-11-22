/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Tony1
 */
public class TipoMoneda extends Colon {
    public TipoMoneda( Convertidor convertidor, int valor )
    {
        this.setImplementador( convertidor );
        this.setValor( valor );
    }

    // ------------------------

    @Override
    public void obtener()
    {
        System.out.println("           ----------------------------------------------");
        System.out.println("                Haciendo la conversion de moneda...");

        this.getImplementador().mostrarMoneda(this.getValor());
    }
}
