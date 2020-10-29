/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4_Builder;

/**
 *
 * @author josue
 */
public class Ejemplo {
    
    public static void main(String[] args) {
        // TODO code application logic here
        ListaItems lista_1 = new ListaItems();
        ListaItems lista_2 = new ListaItems();

        Cuenta cuenta_1 = new Cuenta("cu_1");
        Cuenta cuenta_2 = new Cuenta("cu_2");
        Cuenta cuenta_3 = new Cuenta("cu_3");
        Cuenta cuenta_4 = new Cuenta("cu_4");
        lista_1.Agregar(cuenta_1);
        lista_1.Agregar(cuenta_2);
        lista_1.Agregar(cuenta_3);
        lista_1.Agregar(cuenta_4);
        
        Cliente cliente_1 = new Cliente("cl_1");
        Cliente cliente_2 = new Cliente("cl_2");
        Cliente cliente_3 = new Cliente("cl_3");
        Cliente cliente_4 = new Cliente("cl_4");
        lista_2.Agregar(cliente_1);
        lista_2.Agregar(cliente_2);
        lista_2.Agregar(cliente_3);
        lista_2.Agregar(cliente_4);
        
        TipoVisualizacionCliente clientes = new TipoVisualizacionCliente(lista_2);
        TipoVisualizacionCuenta cuentas = new TipoVisualizacionCuenta(lista_1);
        
        System.out.println(clientes.Visualizar());
        System.out.println(cuentas.Visualizar());
        
    }

    
    
}
