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
public class Agente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Los despegues solo les avisara a todos las aerolineas, al igual que los aterrizajes
        El parametro booleano en la creacion de los vuelos, es la advertencia que genera el agente,
        cuando es falso es que no hay ningun problema cuando es true es que se cancela la actividad.
        
        Los vuelos de la aerolinea AeroBell son domesticos mientras que los de Avianca son internacionales.
        
        */
        
        ITorreControl mediador = new JuanSantamaria();
        
        AeroBell avion1 = new AeroBell(mediador, "Vuelo 747", "Limon", false);
        Avianca avion2 = new Avianca(mediador, "Vuelo 947", "España", false);
        
        AeroBell avion3 = new AeroBell(mediador, "Vuelo 234", "Guanacaste", true);
        Avianca avion4 = new Avianca(mediador, "Vuelo 123", "Brazil", false);
        
        AeroBell avion5 = new AeroBell(mediador, "Vuelo 999", "Puntarenas", false);
        Avianca avion6 = new Avianca(mediador, "Vuelo 111", "Colombia", true);
        
        System.out.println("Bienvenido al Aeropuerto Juan Santamaria");        
        
        mediador.despegar(avion1);
        mediador.despegar(avion2);
        mediador.despegar(avion3);
        mediador.despegar(avion4);
        mediador.aterrizar(avion1);
        mediador.aterrizar(avion4);
        mediador.despegar(avion5);
        mediador.despegar(avion6);
        mediador.aterrizar(avion5);
        mediador.aterrizar(avion2);
        mediador.aterrizar(avion6);
        mediador.aterrizar(avion3); 
    }
    
}
