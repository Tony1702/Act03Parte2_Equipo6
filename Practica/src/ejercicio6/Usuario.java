
package src.ejercicio6;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.ZonedDateTime;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Kenneth
 */
public class Usuario extends JFrame{
    
    public Usuario(){
        this.setSize(100, 100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton btnAyuda = new JButton("Ayuda");
        btnAyuda.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                solicitarAyuda();
            }
        });
        this.add(btnAyuda);
        this.setVisible(true);
    }
    
    private void solicitarAyuda(){       
        System.out.println("-- Solicito la ventana de ayuda --"
                +"\n Hora: "+ZonedDateTime.now()
                +"\n Instancia: "+Singleton.getInstance().toString());
        
        // Solicitud de la instancia del patrón Singleton
        Singleton.getInstance().getAyuda();        
    }
    
    public static void main(String[] args){
        new Usuario().setVisible(true);
    }
}