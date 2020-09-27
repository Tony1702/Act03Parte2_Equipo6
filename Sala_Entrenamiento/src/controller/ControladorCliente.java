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

/**
 *
 * @author Tony1
 */
public class ControladorCliente implements iControlador{
    
    private final Collection<Cliente> clientes;

    protected ControladorCliente() {
        this.clientes = new ArrayList();        
    }                        

    @Override
    public boolean agregar(Object registro) {
        return false;
    }

    public boolean agregar(String idCliente, String nombre, String apellido, 
            String celular, String correo, Date fechaNacimiento, 
            eEstadoCliente estado, Date fechaMatri, Date fechaUltiPago) {
        clientes.add(new Cliente(idCliente, nombre, apellido, celular, correo, 
                fechaNacimiento, estado, fechaMatri, fechaUltiPago));
        return true;
    }
       
    @Override
    public Object consultar(Object llave) {
        for (Cliente cliente : clientes)
            if (cliente.getId().equals(llave))
                return cliente;
        return null;
    }

    @Override
    public boolean modificar(Object registro) {
        return false;
    }

    @Override
    public boolean eliminar(Object registro) {
        return false;
    }     
    
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
    
    protected Collection<Cliente> listarClientes(eEstadoCliente estado) {
        Collection<Cliente> resul = new ArrayList();
        for (Cliente client : clientes)
            if (client.getEstado() == estado)                
                resul.add(client);
        return resul;
    }
    
    protected String realizarPago(String id){
        return "";
    }
}
