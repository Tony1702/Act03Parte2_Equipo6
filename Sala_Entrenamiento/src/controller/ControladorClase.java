/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.ArrayList;
import java.util.Collection;
import model.Clase;
import model.Cliente;
import model.eDiaSemana;
import model.Horario;
import model.Instructor;
import model.Servicio;
import model.eTiempo;
import model.Sala;

/*****Nombre***************************************
 * ControladorClase
 *****Descripción**********************************
 * Es la clase encarga de las iteraciones entre la
 * interfaz y el modelo de clases
 *****Atributos************************************
 * Collection<Clase> clases
 *****Métodos**************************************
 * agregar
 * consultar
 * modificar
 * eliminar
 * incluirClienteAClase
 * actualizarCalendario
 * listarClase
 **************************************************/	
public class ControladorClase implements iControlador{
    
    private final Collection<Clase> clases;

    /*****Nombre***************************************
    * ControladorClase
    *****Descripción**********************************
    * Es el constructor de la clase
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * 
    **************************************************/
    protected ControladorClase() {        
        this.clases = new ArrayList();        
    }

    @Override
    /*****Nombre***************************************
    * agregar
    *****Descripción**********************************
    * Se encarga de agregar una clase recibiendo un registro
    *****Retorno**************************************
    * Un valor boolean
    *****Entradas*************************************
    * Un registro de objeto tipo Object
    **************************************************/
    public boolean agregar(Object registro) {
        return false;
    }
    
    /*****Nombre***************************************
    * agregar
    *****Descripción**********************************
    * Se encarga de agregar una clase 
    *****Retorno**************************************
    * Un valor boolean
    *****Entradas*************************************
    * @param idClase
    * @param sala
    * @param instructor
    * @param servicio
    * @param aforoClase
    * @param dia
    * @param horaInicio
    * @param tiempoInicio
    * @param horaFin
    * @param tiempoFin
    **************************************************/
    public boolean agregar(String idClase, Object sala, Object instructor, 
            Object servicio, int aforoClase, eDiaSemana dia, String horaInicio, 
            eTiempo tiempoInicio, String horaFin, eTiempo tiempoFin){        
                
        Horario horClase = new Horario(dia, horaInicio, tiempoInicio, horaFin, 
                tiempoFin);
                              
        Clase clase = new Clase(idClase, (Sala)sala, (Instructor)instructor,
                (Servicio)servicio, aforoClase, horClase);
        clases.add(clase);
        return true;
    }
    
    @Override
    /*****Nombre***************************************
    * consultar
    *****Descripción**********************************
    * Se encarga de consultar una clase 
    *****Retorno**************************************
    * Un objeto de tipo Object
    *****Entradas*************************************
    * Un objeto de tipo Object
    **************************************************/
    public Object consultar(Object llave) {
        for (Clase clase : clases)
            if (clase.getIdClase().equals(llave))
                return clase;
        return null;
    }

    @Override
    /*****Nombre***************************************
    * modificar
    *****Descripción**********************************
    * Se encarga de modificar una clase 
    *****Retorno**************************************
    * Un valor boolean
    *****Entradas*************************************
    * Un objeto de tipo Object
    **************************************************/
    public boolean modificar(Object registro) {
        return false;
    }

    @Override
    /*****Nombre***************************************
    * eliminar
    *****Descripción**********************************
    * Se encarga de eliminar una clase 
    *****Retorno**************************************
    * Un valor boolean
    *****Entradas*************************************
    * Un objeto de tipo Object
    **************************************************/
    public boolean eliminar(Object registro) {
        return false;
    }    
    
    /*****Nombre***************************************
    * incluirClienteAClase
    *****Descripción**********************************
    * Se encarga de incluir un cliente a clase
    *****Retorno**************************************
    * Un valor boolean
    *****Entradas*************************************
    * @param llave
    * @param cliente
    **************************************************/
    protected boolean incluirClienteAClase(Object llave, Object cliente){       
        for (Clase clase : clases)
            if (clase.getIdClase().equals(llave))
                if (clase.getAsistencia().size() < clase.getAforoClase()){                    
                    clase.getAsistencia().add((Cliente)cliente);
                    return true;
                }
        return false;
    }
    
    /*****Nombre***************************************
    * actualizarCalendario
    *****Descripción**********************************
    * Se encarga de actualizar el calendario
    *****Retorno**************************************
    * Un valor String
    *****Entradas*************************************
    * @param dia
    * @param horario
    * @param duracion
    * @param instructor
    * @param servicio
    **************************************************/
    protected String actualizarCalendario(eDiaSemana dia, Horario horario, 
            int duracion, Instructor instructor, Servicio servicio){
        return " ";
    }
    
    /*****Nombre***************************************
    * listarClase
    *****Descripción**********************************
    * Se encarga de listar las clases dependiendo del dia
    *****Retorno**************************************
    * Un valor String
    *****Entradas*************************************
    * @param dia
    **************************************************/
    protected String listarClase(eDiaSemana dia){
        return " ";
    }           
}
