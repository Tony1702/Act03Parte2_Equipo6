package procesos;

public class ProcesoEstandar implements IProceso {

    @Override
    public void ejecutar(int idProcess,String user,String password) throws Exception {
        System.out.println("Proceso " + idProcess + " ejecutado");
        System.out.println("Proceso" + idProcess + " Finalizado");
    }
}