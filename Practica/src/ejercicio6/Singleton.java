
package src.ejercicio6;

import javax.swing.JFrame;

/**
 *
 * @author Kenneth
 */
public class Singleton {
    // Instancia a la propia clase
    private static Singleton instance;        
    //ventana del manual de ayuda
    static JFrame ventanaAyuda = new JFrame("Manual de ayuda");
    
    // constructor privado para que nadie pueda hacer "new"
    private Singleton(){}
    // metodo getInstance para obtener la instacia unica
    public static synchronized Singleton getInstance(){
        // en caso que no se haya instanciado previamente
        if (instance == null)
            instance = new Singleton();
        return instance;
    }    
    
    public void getAyuda(){    
        Singleton.ventanaAyuda.setSize(400, 50);        
        Singleton.ventanaAyuda.setVisible(true);
    }
}