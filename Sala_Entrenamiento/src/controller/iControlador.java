/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Kenneth
 */

interface iControlador {
    
    boolean agregar(Object registro);
    Object consultar(Object llave);
    boolean modificar(Object registro);
    boolean eliminar(Object registro);
    
}
