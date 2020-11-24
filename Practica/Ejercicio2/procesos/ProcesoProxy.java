package procesos;

import procesos.IProceso;
import procesos.ProcesoEstandar;
import servicios.Auditoria;
import servicios.Seguridad;

public class ProcesoProxy implements IProceso {

    @Override
    public void ejecutar(int idProcess,String usuario,String password) 
            throws Exception {
        Seguridad securityService = new Seguridad();
        if(!securityService.authorization(usuario, password)){
            throw new Exception("El usuario " + usuario + " no tiene los suficientes privilegios");
        }
        
        ProcesoEstandar proceso = new ProcesoEstandar();
        proceso.ejecutar(idProcess, usuario, password);
        
        Auditoria audit = new Auditoria();
        audit.registrandoServicio(usuario, ProcesoEstandar.class.getName());
    }
}