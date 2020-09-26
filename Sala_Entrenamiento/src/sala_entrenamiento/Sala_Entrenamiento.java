/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala_entrenamiento;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Clase;
import model.Cliente;
import model.Horario;
import model.Instructor;
import model.Servicio;
import model.eEstadoCliente;

/**
 *
 * @author Tony1
 */
public class Sala_Entrenamiento {

    /**
     * @param args the command line arguments
     */
     
    public static ArrayList<Servicio> servicios = new ArrayList<Servicio>();
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public static ArrayList<Instructor> instructores = new ArrayList<Instructor>();
    public static ArrayList<Horario> horarios = new ArrayList<Horario>();
    public static ArrayList<Clase> clases = new ArrayList<Clase>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/M/dd/");
        String date = sdf.format(new Date());
        
        Servicio yoga = new Servicio("1234", "Yoga Contemporanea");
        
        servicios.add(yoga);
        
        Cliente juan = new Cliente("1", "Juan", "Castro", "11111111", "juanC@gmail.com", new Date(), eEstadoCliente.Activo, new Date(), new Date());
        Instructor monica = new Instructor("1001", "Monica", "Salazar", "22222222", "monicaS@gmail.com", new Date(), false,servicios);

        clientes.add(juan);
        instructores.add(monica);
        
        Horario horarioYoga = new Horario("Martes", "10:30 am", "11:30 am");
        
        horarios.add(horarioYoga);
        
        Clase claseYoga = new Clase(instructores.get(1), servicios.get(1), 24, horarios.get(1));
        
        clases.add(claseYoga);
        
        // Matriculados
        System.out.println("Estos son los clientes matriculados");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNombre()+" "+cliente.getApellido());
        }
        
        System.out.println("Visualizar clase 1234: " + clases.get(1).getServicio());
        
    }  
}
