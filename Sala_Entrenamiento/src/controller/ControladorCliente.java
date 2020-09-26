/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.ArrayList;
import java.util.Collection;
import model.Cliente;
import model.eEstadoCliente;

/**
 *
 * @author Tony1
 */
public class ControladorCliente {
    private Collection<Cliente> clientes;

    public ControladorCliente() {
        this.clientes = new ArrayList<Cliente>();
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public String listarClientes(eEstadoCliente estado) {
        return " ";
    }
    
    public String realizarPago(String id){
        return "Pago realizado";
    }
    
}
