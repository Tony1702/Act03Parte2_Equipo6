/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

/**
 *
 * @author josue
 */
public class Ejercicio7 {

    private static final String[] nombresCanciones = new String[1000]; 

    private static final String[] nombresListas = new String[256]; 

    private static final List<ListaCancion> listasReproduccion = new ArrayList<>(); 

 

    public static void main(String[] args) { 

        Runtime runtime = Runtime.getRuntime();
        
        CancionFactory.usoFlyweight = true; 

        inicializar(); 

        createRandonListaCancion();     

        long memoriaUsada = runtime.totalMemory() - runtime.freeMemory(); 

        System.out.println("Memoria Usada => " + (memoriaUsada / 1000000));// 

    } 

 

    private static void createRandonListaCancion() { 

        Random random = new Random(); 

        int p = 0; 

        for (int c = 0; c < nombresListas.length; c++) { 

            ListaCancion lista = new ListaCancion(nombresListas[c]); 

            for (int i = 0; i < 10; i++) { 

                int song = random.nextInt(nombresCanciones.length); 

                lista.addCancion(nombresCanciones[song]); 

            } 

            listasReproduccion.add(lista); 

        } 

    } 

 

    private static void inicializar() { 

        for (int index = 0; index < nombresCanciones.length; index++) { 

            nombresCanciones[index] = "Song " + (index + 1); 

        } 

 

        for (int index = 0; index < nombresListas.length; index++) { 

            nombresListas[index] = "ListaCancion " + (index + 1); 

        } 

    } 
    
}
