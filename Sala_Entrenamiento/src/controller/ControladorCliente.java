/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import model.Cliente;
import model.eEstadoCliente;

/*****Nombre***************************************
 * ControladorCliente
 *****Descripción**********************************
 * Es la clase encarga de las iteraciones entre la
 * interfaz y el modelo de Cliente
 *****Atributos************************************
 * Collection<Cliente> clientes
 *****Métodos**************************************
 * ControladorCliente
 * agregar
 * consultar
 * modificar
 * eliminar
 * cumpleEstado
 * listarClientes
 * realizarPago
 **************************************************/
public class ControladorCliente implements iControlador{
    
    private final Collection<Cliente> clientes;

    /*****Nombre***************************************
    * ControladorCliente
    *****Descripción**********************************
    * Constructor
    *****Retorno**************************************
    * 
    *****Entradas*************************************
    * 
    **************************************************/
    protected ControladorCliente() {
        this.clientes = new ArrayList();        
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
    * Se encarga de agregar un Cliente
    *****Retorno**************************************
    * Un valor de tipo boolean
    *****Entradas*************************************
    * @param idCliente
    * @param nombre
    * @param apellido
    * @param celular
    * @param correo
    * @param fechaNacimiento
    * @param estado
    * @param fechaMatri
    * @param fechaUltiPago
    **************************************************/
    public boolean agregar(String idCliente, String nombre, String apellido, 
            String celular, String correo, Date fechaNacimiento, 
            eEstadoCliente estado, Date fechaMatri, Date fechaUltiPago) {
        clientes.add(new Cliente(idCliente, nombre, apellido, celular, correo, 
                fechaNacimiento, estado, fechaMatri, fechaUltiPago));
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
        for (Cliente cliente : clientes)
            if (cliente.getId().equals(llave))
                return cliente;
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
    * cumpleEstado
    *****Descripción**********************************
    * Si un cliente cumple cierto estado
    *****Retorno**************************************
    * Un valor boolean
    *****Entradas*************************************
    * @param llave
    * @param estado
    **************************************************/
    protected boolean cumpleEstado(Object llave, eEstadoCliente estado){
        for (Cliente client : clientes)
            if (client.getId().equals(llave)){
                if (client.getEstado() == estado)
                    return true;
                else
                    return false;
            }                
        return false;
    }
    
    /*****Nombre***************************************
    * listarClientes
    *****Descripción**********************************
    * Se encarga de listar los clientes
    *****Retorno**************************************
    * Una lista de tipo clientes
    *****Entradas*************************************
    * @param estado
    **************************************************/
    protected Collection<Cliente> listarClientes(eEstadoCliente estado) {
        Collection<Cliente> resul = new ArrayList();
        for (Cliente client : clientes)
            if (client.getEstado() == estado)                
                resul.add(client);
        return resul;
    }
    
    /*****Nombre***************************************
    * realizarPago
    *****Descripción**********************************
    * Permite a un cliente realizar pagos
    *****Retorno**************************************
    * Un valor String
    *****Entradas*************************************
    * @param id
    **************************************************/
    protected String realizarPago(String id){
        return "";
    }
}
