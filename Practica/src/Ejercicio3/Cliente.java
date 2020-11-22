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
public class Cliente {
    public static void main(String[] args)
    {   
        int valorAConvertir = 10000;
        
        System.out.println("Este banco se penso en colones, se convertira su dinero en la respectiva moneda");
        System.out.println("Se tiene Dolares desde el inicio, pero ahora se integro Euros y Yenes");
        
        // Crear un objeto de tipo 'AbstraccionRefinada' indicándole un 'ImplementadorConcreto'
        Colon moneda = new TipoMoneda( new Dolar(), valorAConvertir );
        moneda.obtener();
        
        moneda.setImplementador( new Yen() );
        moneda.obtener();
        
        moneda.setImplementador( new Euro() );
        moneda.obtener();
    }
}
