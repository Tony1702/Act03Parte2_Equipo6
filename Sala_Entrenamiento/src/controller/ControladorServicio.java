/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collection;
import model.Servicio;

/*****Nombre***************************************
 * ControladorServicio
 *****Descripción**********************************
 * Es la clase encarga de las iteraciones entre la
 * interfaz y el modelo de Instructor
 *****Atributos************************************
 * Collection<Servicio> servicios
 *****Métodos**************************************
 * ControladorServicio
 * listarServicios
 * agregar
 * consultar
 * modificar
 * eliminar
 **************************************************/
public class ControladorServicio implements iControlador{
    
    private final Collection<Servicio> servicios;
    
    /*****Nombre***************************************
    * ControladorServicio
    *****Descripción**********************************
    * Es el constructor de la clase
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * 
    **************************************************/
    protected ControladorServicio(){
        servicios = new ArrayList();        
    }

    /*****Nombre***************************************
    * listarServicios
    *****Descripción**********************************
    * Se encarga de enlistar los servicios existentes
    *****Retorno**************************************
    * Una lista de objetos Servicio
    *****Entradas*************************************
    * 
    **************************************************/
    public Collection<Servicio> listarServicios() {
        return servicios;
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
    * Se encarga de agregar un servicio
    *****Retorno**************************************
    * Un valor boolean
    *****Entradas*************************************
    * @param idServicio
    * @param descripcion
    **************************************************/
    public boolean agregar(String idServicio, String descripcion){        
        servicios.add(new Servicio(idServicio, descripcion));
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
        for (Servicio serv : servicios)
            if(serv.getCodigo().equals(llave))
                return serv;
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
}
