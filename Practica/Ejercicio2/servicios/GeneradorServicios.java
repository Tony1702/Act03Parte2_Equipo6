package servicios;

import procesos.IProceso;
import procesos.ProcesoProxy;

/**
 * @author Oscar Javier Blancarte Iturralde
 * @see http://www.oscarblancarteblog.com
 */
public class GeneradorServicios {
    
    public static IProceso crearEjecutor(){
        return new ProcesoProxy();
    }
}