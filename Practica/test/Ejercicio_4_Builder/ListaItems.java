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
public class ListaItems {
    private LinkedList<Object> items;
    
    public ListaItems(){
        this.items= new LinkedList<>();
    }
    
    public void Agregar(Object pItem){
        items.add(pItem);
    }
    
    public LinkedList getItems(){
        return items;
    }
    
}
