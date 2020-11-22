/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class ListaCancion {
    private String listaName; 
    private List<Cancion> canciones = new ArrayList<>(); 


    public ListaCancion(String listaName) { 
        this.listaName = listaName; 
    } 

 

    public String getListaCancionName() { 
        return listaName; 
    } 

 

    public void setListaCancionName(String listaName) { 
        this.listaName = listaName; 
    } 

 

    public List<Cancion> getCanciones() { 
        return canciones; 
    } 

 

    public void setCanciones(List<Cancion> canciones) { 
        this.canciones = canciones;
    } 

 

    public void addCancion(String cancionName) { 
        canciones.add(CancionFactory.createCancion(cancionName)); 
    } 

 

    public void printLista() { 
        String out = "\nListaCancion > " + listaName; 
        for(Cancion cancion : canciones) { 
            out += "\n\t" + cancion.toString(); 
        }
        System.out.println(out); 
    } 

} 

