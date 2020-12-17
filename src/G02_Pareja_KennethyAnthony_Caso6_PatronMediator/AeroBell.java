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
public class AeroBell extends Avion{
    private ITorreControl mediador;

    public AeroBell(ITorreControl mediador, String nombreAvion, String ruta, Boolean advertencia) {
        super(mediador, nombreAvion, ruta, advertencia);
    }

    @Override
    public void despegarAvion(Avion bell) {
        if(!bell.getAdvertencia()) {
            System.out.println("---------------AEROBELL AIRLINES---------------");
            System.out.println("El avion " + bell.getNombreAvion() + " despegara hacia la ruta San Jose-" + bell.getRuta());
            System.out.println("-----------------------------------------------");
        }
        else{
            System.out.println("**AEROBELL AIRLINES cancela el vuelo " + bell.getNombreAvion() + ", debido a problema de combustible**");
        }            
    }

    @Override
    public void aterrizarAvion(Avion bell) {
        if(!bell.getAdvertencia()) {
            System.out.println("---------------AEROBELL AIRLINES---------------");
            System.out.println("El avion " + bell.getNombreAvion() + " de la ruta " + bell.getRuta() + "-San Jose va a aterrizar");
            System.out.println("-----------------------------------------------");
        }
        else{
            System.out.println("**AEROBELL AIRLINES " + bell.getRuta() + " sigue volando, debido a problemas en la pista**");
        }        
    }
}
