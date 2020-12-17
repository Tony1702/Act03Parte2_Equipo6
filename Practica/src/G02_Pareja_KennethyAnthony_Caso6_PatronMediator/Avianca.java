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
public class Avianca extends Avion{
    private ITorreControl mediador;

    public Avianca(ITorreControl mediador, String nombreAvion, String ruta, Boolean advertencia) {
        super(mediador, nombreAvion, ruta, advertencia);
    }

    @Override
    public void despegarAvion(Avion avianca) {
        if(!avianca.getAdvertencia()) {
            System.out.println("---------------Avianca AIRLINES---------------");
            System.out.println("El avion " + avianca.getNombreAvion() + " despegara hacia la ruta Costa Rica-" + avianca.getRuta());
            System.out.println("--------------------------------------------");
        }
        else{
            System.out.println("**Avianca AIRLINES cancela el vuelo " + avianca.getNombreAvion() + ", debido a problema de combustible**");
        }            
    }

    @Override
    public void aterrizarAvion(Avion avianca) {
        if(!avianca.getAdvertencia()) {
            System.out.println("---------------Avianca AIRLINES---------------");
            System.out.println("El avion " + avianca.getNombreAvion() + " de la ruta " + avianca.getRuta() + "-Costa Rica va a aterrizar");
            System.out.println("--------------------------------------------");
        }
        else{
            System.out.println("**Avianca AIRLINES " + avianca.getRuta() + " sigue volando, debido a problemas en la pista**");
        }        
    } 
}
