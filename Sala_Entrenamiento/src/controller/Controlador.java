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


/*****Nombre***************************************
 * Controlador
 *****Descripción**********************************
 * Es la clase controlador principal
 *****Atributos************************************
 * ControladorClase gClases;
   ControladorCliente gClientes;
   ControladorInstructor gInstructores;
   ControladorSala gSalas;
   ControladorServicio gServicios;
 *****Métodos**************************************
 * configurarNuevaSala
 * definirNombreSala
 * definirHorarioSala
 * definirCostoMatricula
 * definirCostoMensualidad
 * definirCapacidad
 * definirAforo
 * registrarServicio
 * editarServicio
 * consultarServicio
 * registrarInstructor
 * consultarInstructor
 * matricularCliente
 * crearCalendarioParaUnMes
 * programarUnaClase
 * aplicarMensualidad
 * reservarEspacioEnClase
 * cancelarUnaReservacion
 * sustituirInstructor
 * verCalendarioDelMes
 * verInstructores
 * verConfiguracionSala
 * verListaClientes
 * verListaServicios
 * verReservasDeUnaClase
 **************************************************/	

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
    
   /*****Nombre***************************************
    * configurarNuevaSala
    *****Descripción**********************************
    * Este metodo permite configuar una sala
    *****Entradas*************************************
     * @param idSala
     * @param nombreSala
     * @param capacidadMax
     * @param mensualidad
     * @param aforo
     * @param horaInicio
     * @param tiempoInicio
     * @param horaFin
     * @param tiempoFin
    **************************************************/
    public void configurarNuevaSala(String idSala, String nombreSala, int capacidadMax, 
            float mensualidad, int aforo, String horaInicio, eTiempo tiempoInicio, 
            String horaFin, eTiempo tiempoFin){
            gSalas.agregar(idSala, nombreSala, capacidadMax, mensualidad, aforo, 
                horaInicio,tiempoInicio,horaFin,tiempoFin);
    }
    
    /*****Nombre***************************************
    * definirNombreSala
    *****Descripción**********************************
    * Permite definir el nombre de una sala
    *****Entradas*************************************
    * @param idSala
    * @param nombre
    **************************************************/
    public void definirNombreSala(String idSala, String nombre){}
    
    /*****Nombre***************************************
    * definirHorarioSala
    *****Descripción**********************************
    * Permite definir el horario de una sala
    *****Entradas*************************************
    * @param idSala
    * @param horaInicio
    * @param tiempoInicio
    * @param horaFin
    * @param tiempoFin
    **************************************************/
    public void definirHorarioSala(String idSala, String horaInicio, eTiempo tiempoInicio, 
            String horaFin, eTiempo tiempoFin){}
    
    /*****Nombre***************************************
    * definirCostoMatricula
    *****Descripción**********************************
    * Permite definir el costo de matricula de una sala
    *****Entradas*************************************
    * @param idSala
    * @param costoMatricula
    **************************************************/
    public void definirCostoMatricula(String idSala, int costoMatricula){}
    
    /*****Nombre***************************************
    * definirCostoMensualidad
    *****Descripción**********************************
    * Permite definir el costo de mensualidad de una sala
    *****Entradas*************************************
    * @param idSala
    * @param costoMensualidad
    **************************************************/
    public void definirCostoMensualidad(String idSala, float costoMensualidad){}
    
    /*****Nombre***************************************
    * definirCapacidad
    *****Descripción**********************************
    * Permite definir la capacidad de una sala
    *****Entradas*************************************
    * @param idSala
    * @param capacidadMax
    **************************************************/
    public void definirCapacidad(String idSala, int capacidadMax){}
    
    /*****Nombre***************************************
    * definirAforo
    *****Descripción**********************************
    * Permite definir el aforo de una sala
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * @param idSala
    * @param aforoGlobal
    **************************************************/
    public void definirAforo(String idSala, int aforoGlobal){}
    
    /*****Nombre***************************************
    * registrarServicio
    *****Descripción**********************************
    * Permite registrar un servicio de una sala
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * @param idServicio
    * @param descripcion
    **************************************************/
    public void registrarServicio(String idServicio, String descripcion){
        gServicios.agregar(idServicio,descripcion);        
    }
    
    /*****Nombre***************************************
    * editarServicio
    *****Descripción**********************************
    * Permite editar el servicio de una sala
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * 
    **************************************************/
    public void editarServicio(){}
    
    /*****Nombre***************************************
    * consultarServicio
    *****Descripción**********************************
    * Permite consultar el servicio de una sala
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * 
    **************************************************/
    public void consultarServicio(){}
    
    /*****Nombre***************************************
    * registrarInstructor
    *****Descripción**********************************
    * Permite registar un instructor de una sala
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * @param idInstructor
    * @param nombre
    * @param apellido
    * @param celular
    * @param correo
    * @param fechaNacimiento
    * @param temporal
    * @param servicios 
    **************************************************/
    public void registrarInstructor(String idInstructor, String nombre, String apellido, 
            String celular, String correo, Date fechaNacimiento, boolean temporal, 
            Collection servicios){
        gInstructores.agregar(idInstructor, nombre, apellido, celular, correo, 
                fechaNacimiento, temporal, servicios);
    }
    
    /*****Nombre***************************************
    * editarInstructor
    *****Descripción**********************************
    * Permite editar un instructor de una sala
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * 
    **************************************************/
    public void editarInstructor(){}
    
    /*****Nombre***************************************
    * consultarInstructor
    *****Descripción**********************************
    * Permite consultar un instructor de una sala
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * 
    **************************************************/
    public void consultarInstructor(){}
    
    /*****Nombre***************************************
    * matricularCliente
    *****Descripción**********************************
    * Permite matricular un cliente en una sala
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * @param idCliente
    * @param nombre
    * @param apellido
    * @param celular
    * @param correo
    * @param fechaNacimiento 
    **************************************************/
    public void matricularCliente(String idCliente, String nombre, String apellido, 
            String celular, String correo, Date fechaNacimiento){
        Date hoy = new Date();
        gClientes.agregar(idCliente, nombre, apellido, celular, correo, 
                fechaNacimiento, eEstadoCliente.ACTIVO, hoy, hoy);
    }
    
    /*****Nombre***************************************
    * crearCalendarioParaUnMes
    *****Descripción**********************************
    * Permite crear el calendario de una sala
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * 
    **************************************************/
    public void crearCalendarioParaUnMes(){}
    
    /*****Nombre***************************************
    * programarUnaClase
    *****Descripción**********************************
    * Permite programar la clase de una sala
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * @param idClase
    * @param idSala
    * @param idInstructor
    * @param idServicio
    * @param aforoClase
    * @param dia
    * @param horaIni
    * @param tiempoIni
    * @param horaFin
    * @param tiempoFin
    **************************************************/
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
    
    /*****Nombre***************************************
    * aplicarMensualidad
    *****Descripción**********************************
    * Permite aplicar la mensualidad de una sala
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * 
    **************************************************/
    public void aplicarMensualidad(){}
    
    /*****Nombre***************************************
    * reservarEspacioEnClase
    *****Descripción**********************************
    * Permite reservar espacio de una clase
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * @param idClase
    * @param idCliente 
    **************************************************/
    public void reservarEspacioEnClase(String idClase, String idCliente){
        Object clase, cliente;
        clase = gClases.consultar(idClase);
        cliente = gClientes.consultar(idCliente);        
        if(clase != null && cliente != null && 
                gClientes.cumpleEstado(idCliente,eEstadoCliente.ACTIVO))
            gClases.incluirClienteAClase(idClase,cliente);
    }
    
    /*****Nombre***************************************
    * cancelarUnaReservacion
    *****Descripción**********************************
    * Permite cancelar reservacion de una clase
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * 
    **************************************************/
    public void cancelarUnaReservacion(){}        
    
    /*****Nombre***************************************
    * sustituirInstructor
    *****Descripción**********************************
    * Permite reemplazar un instructor de una clase
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * 
    **************************************************/
    public void sustituirInstructor(){}
    
    /*****Nombre***************************************
    * verCalendarioDelMes
    *****Descripción**********************************
    * Permite ver el calendario de un mes
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * 
    **************************************************/
    public void verCalendarioDelMes(){}
    
    /*****Nombre***************************************
    * verInstructores
    *****Descripción**********************************
    * Permite ver los instructores
    *****Retorno**************************************
    * Una lista con los objetos instructores
    *****Entradas*************************************
    * @param temporal
    **************************************************/
    public Collection verInstructores(boolean temporal){
        return gInstructores.getInstructores(temporal);
    }
    
    /*****Nombre***************************************
    * verConfiguracionSala
    *****Descripción**********************************
    * Permite ver la configuracion de una sala
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * 
    **************************************************/
    public void verConfiguracionSala(){}
    
    /*****Nombre***************************************
    * verListaClientes
    *****Descripción**********************************
    * Permite ver la listas de objetos clientes
    *****Retorno**************************************
    * Una lista con los clientes
    *****Entradas*************************************
    * @param estado
    **************************************************/
    public Collection verListaClientes(Enum estado){
        return gClientes.listarClientes((eEstadoCliente)estado);
    }
    
    /*****Nombre***************************************
    * verListaServicios
    *****Descripción**********************************
    * Permite ver la lista de servicios
    *****Retorno**************************************
    * Una lista con los objetos servicios
    *****Entradas*************************************
    * 
    **************************************************/
    public Collection verListaServicios(){
        return gServicios.listarServicios();
    }
    
    /*****Nombre***************************************
    * verReservasDeUnaClase
    *****Descripción**********************************
    * Permite ver las reservas de una clase
    *****Retorno**************************************
    * Un valor String
    *****Entradas*************************************
    * @param idClase
    **************************************************/
    public String verReservasDeUnaClase(String idClase){
        Object clase = gClases.consultar(idClase);        
        if (clase != null)       
            return clase.toString();
        return "";
    }
    
}
