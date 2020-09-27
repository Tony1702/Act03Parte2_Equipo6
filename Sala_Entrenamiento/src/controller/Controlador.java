/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Collection;
import java.util.Date;
import model.eDiaSemana;
import model.eEstadoCliente;
import model.eTiempo;

/**
 *
 * @author Kenneth
 */

public class Controlador {
    
    private final ControladorClase gClases;
    private final ControladorCliente gClientes;
    private final ControladorInstructor gInstructores;
    private final ControladorSala gSalas;
    private final ControladorServicio gServicios;
    
    public Controlador(){
        gClases = new ControladorClase();
        gClientes = new ControladorCliente();
        gInstructores = new ControladorInstructor();
        gSalas = new ControladorSala();
        gServicios = new ControladorServicio();
    }
    
    public void configurarNuevaSala(String idSala, String nombreSala, int capacidadMax, 
            float mensualidad, int aforo, String horaInicio, eTiempo tiempoInicio, 
            String horaFin, eTiempo tiempoFin){
        gSalas.agregar(idSala, nombreSala, capacidadMax, mensualidad, aforo, 
                horaInicio,tiempoInicio,horaFin,tiempoFin);
    }
    
    public void definirNombreSala(String idSala, String nombre){}
    
    public void definirHorarioSala(String idSala, String horaInicio, eTiempo tiempoInicio, 
            String horaFin, eTiempo tiempoFin){}
    
    public void definirCostoMatricula(String idSala, int costoMatricula){}
    
    public void definirCostoMensualidad(String idSala, float costoMensualidad){}
    
    public void definirCapacidad(String idSala, int capacidadMax){}
    
    public void definirAforo(String idSala, int aforoGlobal){}
    
    public void registrarServicio(String idServicio, String descripcion){
        gServicios.agregar(idServicio,descripcion);        
    }
    
    public void editarServicio(){}
    
    public void consultarServicio(){}
    
    public void registrarInstructor(String idInstructor, String nombre, String apellido, 
            String celular, String correo, Date fechaNacimiento, boolean temporal, 
            Collection servicios){
        gInstructores.agregar(idInstructor, nombre, apellido, celular, correo, 
                fechaNacimiento, temporal, servicios);
    }
    
    public void editarInstructor(){}
    
    public void consultarInstructor(){}
    
    public void matricularCliente(String idCliente, String nombre, String apellido, 
            String celular, String correo, Date fechaNacimiento){
        Date hoy = new Date();
        gClientes.agregar(idCliente, nombre, apellido, celular, correo, 
                fechaNacimiento, eEstadoCliente.ACTIVO, hoy, hoy);
    }
    
    public void crearCalendarioParaUnMes(){}
    
    public void programarUnaClase(String idClase, String idSala, String idInstructor,
            String idServicio, int aforoClase, eDiaSemana dia, String horaIni,
            eTiempo tiempoIni, String horaFin, eTiempo tiempoFin){
        
        Object sala,instructor,servicio;
        sala = gSalas.consultar(idSala);        
        instructor = gInstructores.consultar(idInstructor);        
        servicio = gServicios.consultar(idServicio);                         
        if(sala != null && instructor != null && servicio != null && 
                gSalas.obtenerAforo(idSala) >= aforoClase)       
            gClases.agregar(idClase, sala, instructor, servicio, aforoClase,
                    dia, horaIni, tiempoIni, horaFin, tiempoFin);            
        
    }
    
    public void aplicarMensualidad(){}
    
    public void reservarEspacioEnClase(String idClase, String idCliente){
        Object clase, cliente;
        clase = gClases.consultar(idClase);
        cliente = gClientes.consultar(idCliente);        
        if(clase != null && cliente != null && 
                gClientes.cumpleEstado(idCliente,eEstadoCliente.ACTIVO))
            gClases.incluirClienteAClase(idClase,cliente);
    }
    
    public void cancelarUnaReservacion(){}        
    
    public void sustituirInstructor(){}
    
    public void verCalendarioDelMes(){}
    
    public Collection verInstructores(boolean temporal){
        return gInstructores.getInstructores(temporal);
    }
    
    public void verConfiguracionSala(){}
    
    public Collection verListaClientes(Enum estado){
        return gClientes.listarClientes((eEstadoCliente)estado);
    }
    
    public Collection verListaServicios(){
        return gServicios.listarServicios();
    }
    
    public String verReservasDeUnaClase(String idClase){
        Object clase = gClases.consultar(idClase);        
        if (clase != null)       
            return clase.toString();
        return "";
    }
    
}
