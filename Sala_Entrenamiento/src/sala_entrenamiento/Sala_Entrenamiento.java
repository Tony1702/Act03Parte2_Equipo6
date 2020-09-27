/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala_entrenamiento;

import java.util.Collection;
import java.util.Date;
import model.eDiaSemana;
import model.eEstadoCliente;
import model.eTiempo;
import view.Vista;

/**
 *
 * @author Tony1
 */
public class Sala_Entrenamiento{
        
    /**
     * @param args the command line arguments
     */
        
    
    public static void main(String[] args) {                     
        
        // Unico medio para interactuar con el sistema,
        // respetando el principio de encapsulamiento de información
        Vista vista = new Vista();
        
        // 1.
        vista.getControlador().configurarNuevaSala("1", "Sala de fuerza", 25, 
                15500, 18, "6:00", eTiempo.AM, "2:00", eTiempo.PM);
        
        System.out.println("///////////////////////////////////////////////////");
        
        // 2.
        vista.getControlador().registrarServicio("1","Ejercicio funcional");
        vista.getControlador().registrarServicio("3","Cardio-dance");
        vista.getControlador().registrarServicio("1234", "Yoga Contemporanea");
        
        Collection servDispon = vista.getControlador().verListaServicios();
        for (Object serv: servDispon)
            System.out.println(serv.toString());
        
        System.out.println("///////////////////////////////////////////////////");
        // 3. 
        vista.getControlador().registrarInstructor("1", "Karla", "Arroyo Viquez", 
                "89898989", "karlaA@gmail.com", new Date(), true, servDispon);
        vista.getControlador().registrarInstructor("1001", "Monica", "Salazar Gil", 
                "22222222", "monicaS@gmail.com", new Date(), false, servDispon); 
        
        Collection instrDispon = vista.getControlador().verInstructores(false);
        for (Object inst: instrDispon)
            System.out.println(inst.toString());
        
        System.out.println("///////////////////////////////////////////////////");
        // 4.
        vista.getControlador().matricularCliente("1", "Juan", "Castro Ulloa", 
                "88888888", "juanC@gmail.com", new Date());
        vista.getControlador().matricularCliente("2", "Maria", "Martinez Cerdas", 
                "66666666", "mariaM@gmail.com", new Date());
        vista.getControlador().matricularCliente("3", "Glenda", "Cedeño Castro", 
                "77777777", "glendaC@gmail.com", new Date());
        vista.getControlador().matricularCliente("11", "Juan", "Castro", "11111111", 
                "juanC@gmail.com", new Date());
        
        Collection clientDispon = vista.getControlador().verListaClientes(
                eEstadoCliente.ACTIVO);
        for (Object client: clientDispon)
            System.out.println(client.toString());
        
        System.out.println("///////////////////////////////////////////////////");
        // 5.
        vista.getControlador().programarUnaClase("35", "1", "1001", "3", 18,
                eDiaSemana.JUEVES, "7:30", eTiempo.AM, "9:30", eTiempo.AM);
        
        System.out.println("///////////////////////////////////////////////////");
        // 6.
        vista.getControlador().reservarEspacioEnClase("35","2");
        vista.getControlador().reservarEspacioEnClase("35","3");
                
        System.out.println("///////////////////////////////////////////////////");
        // 7.
        System.out.println(
                vista.getControlador().verReservasDeUnaClase("35")
        );
        
    }  
            
}
