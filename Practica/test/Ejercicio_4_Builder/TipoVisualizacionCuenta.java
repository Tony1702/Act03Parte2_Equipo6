/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio_4_Builder;
import java.util.LinkedList;

/**
 *
 * @author josue
 */
public class TipoVisualizacionCuenta extends Builder {
    private ListaItems producto;
    
    public TipoVisualizacionCuenta(ListaItems pProducto){
        this.producto = pProducto;
    }
    
    @Override
    public String Visualizar() {
        String mensaje= "";
        LinkedList lista= producto.getItems();
        
        for(int i = 0; i < lista.size(); i++){
            mensaje += "Su codigo de cuenta es: " + lista.get(i).toString() + "\n";
        }
                
        return mensaje;
    }
}
