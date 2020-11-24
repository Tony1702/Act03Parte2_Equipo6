package procesos;

public interface IProceso {
    public void ejecutar(int idProcess, String user, String password)
            throws Exception;
}