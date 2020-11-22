/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7;

/**
 *
 * @author josue
 */
public class Cancion {
    private int id; 
    private String cancionName; 
    private byte[] cancion = new byte[1000000]; 

    public Cancion(int id, String cancionName) { 
        this.id = id; 
        this.cancionName = cancionName; 
    } 

    public Cancion() { 
    } 

    public String getCancionName() { 
        return cancionName; 
    } 

 

    public void setCancionName(String cancionName) { 
        this.cancionName = cancionName; 
    } 

 

    public int getId() { 
        return id; 
    } 

 

    public void setId(int id) { 
        this.id = id; 
    } 

    @Override 
    public String toString() { 
        return "PlayItem{" + "id=" + id + ", cancionName=" + cancionName + '}'; 
    } 

}
