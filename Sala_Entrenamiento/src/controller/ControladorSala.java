/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Collection;
import java.util.ArrayList;
import model.Horario;
import model.Sala;
import model.eDiaSemana;
import model.eTiempo;

/*****Nombre***************************************
 * ControladorSala
 *****Descripción**********************************
 * Es la clase encarga de las iteraciones entre la
 * interfaz y el modelo de Instructor
 *****Atributos************************************
 * Collection<Sala> salas
 *****Métodos**************************************
 * ControladorSala
 * agregar
 * consultar
 * modificar
 * eliminar
 * obtenerAforo
 **************************************************/	
class ControladorSala implements iControlador{

    private final Collection<Sala> salas;
    
   /*****Nombre***************************************
    * ControladorSala
    *****Descripción**********************************
    * Es el construtor de la clase
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * 
    **************************************************/
    protected ControladorSala(){
        this.salas = new ArrayList();      
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
    * Permite agregar salas
    *****Retorno**************************************
    * Un valor boolean
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
    public boolean agregar(String idSala, String nombreSala, int capacidadMax, 
            float mensualidad, int aforo, String horaInicio, eTiempo tiempoInicio, 
            String horaFin, eTiempo tiempoFin){
        
        if (capacidadMax > aforo){
            Collection<Horario> hSemanal = new ArrayList();
            for (eDiaSemana dia : eDiaSemana.values())
                hSemanal.add(new Horario(dia, horaInicio, tiempoInicio, horaFin, 
                    tiempoFin));

            Sala salaNueva = new Sala(idSala, nombreSala, capacidadMax, mensualidad, 
                    aforo,hSemanal);
            salas.add(salaNueva);
            return true;
        }
        return false;
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
        for (Sala sala : salas)
            if(sala.getId().equals(llave))
                return sala;
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
    * obtenerAforo
    *****Descripción**********************************
    * Permite obtener la cantidad del aforo
    *****Retorno**************************************
    * Un valor int
    *****Entradas*************************************
    * @param llave
    **************************************************/
    protected int obtenerAforo(Object llave){
        for (Sala sala : salas)
            if(sala.getId().equals(llave))
                return sala.getAforo();
        return 0;
    }
}
