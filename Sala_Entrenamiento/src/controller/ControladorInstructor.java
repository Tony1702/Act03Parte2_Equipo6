/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import model.Instructor;

/*****Nombre***************************************
 * ControladorInstructor
 *****Descripción**********************************
 * Es la clase encarga de las iteraciones entre la
 * interfaz y el modelo de Instructor
 *****Atributos************************************
 * Collection<Instructor> instructores
 *****Métodos**************************************
 * ControladorInstructor
 * agregar
 * consultar
 * modificar
 * eliminar
 * getInstructores
 **************************************************/
public class ControladorInstructor implements iControlador{

    private final Collection<Instructor> instructores;
    
    /*****Nombre***************************************
    * ControladorInstructor
    *****Descripción**********************************
    * Constructor de la clase
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * 
    **************************************************/
    protected ControladorInstructor(){
        instructores = new ArrayList();        
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
    * Permite agregar instructores
    *****Retorno**************************************
    * Un valor boolean
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
    public boolean agregar(String idInstructor, String nombre, String apellido, 
            String celular, String correo, Date fechaNacimiento, boolean temporal, 
            Collection servicios) {
        instructores.add(new Instructor(idInstructor, nombre, apellido, celular, 
                correo, fechaNacimiento, temporal, servicios));        
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
        for (Instructor instruc : instructores)
            if(instruc.getId().equals(llave))
                return instruc;
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
    * getInstructores
    *****Descripción**********************************
    * Permite obtener una lista con los instrutores
    *****Retorno**************************************
    * Una lista de objetos Instructor
    *****Entradas*************************************
    * @param temporal
    **************************************************/
    protected Collection<Instructor> getInstructores(boolean temporal) {        
        if (temporal)
            return instructores;
        else{
            Collection<Instructor> resul = new ArrayList();
            for (Instructor inst : instructores)
                if (!inst.isTemporal())
                    resul.add(inst);
            return resul;
        }
    }
}
