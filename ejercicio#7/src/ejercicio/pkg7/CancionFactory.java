/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7;
import java.util.Map;
import java.util.HashMap;


/**
 *
 * @author josue
 */
public class CancionFactory {
    public static boolean usoFlyweight = true; 

    private static final Map<String,Cancion> REPRODUCTOR_CANCIONES = new HashMap<>(); 

    private static int idSecuencia = 0; 

    public static Cancion createCancion(String cancionName){ 
        if(usoFlyweight && REPRODUCTOR_CANCIONES.containsKey(cancionName)){ 
            return REPRODUCTOR_CANCIONES.get(cancionName); 
        }else{ 
            Cancion cancion = new Cancion(++idSecuencia, cancionName); 
            REPRODUCTOR_CANCIONES.put(cancionName, cancion); 
            return cancion; 
        } 
    } 
}
