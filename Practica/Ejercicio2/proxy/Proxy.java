package proxy;

import procesos.IProceso;
import servicios.GeneradorServicios;

/**
 *
 * @author Óscar Vega Ramírez 200450600
 */
public class Proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario = "Ovega";
        String password = "SuperVegeta2000";
        String usuario1 = "Ovega1";
        String password1 = "SuperVegeta2000";
        int proceso = 1;
        IProceso procesoEstandar = GeneradorServicios.crearEjecutor();
        try {
            procesoEstandar.ejecutar(proceso, usuario, password);
            procesoEstandar.ejecutar(proceso, usuario1, password1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
