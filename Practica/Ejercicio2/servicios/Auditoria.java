package servicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Auditoria {
    public void registrandoServicio(String usuario, String servicio){
        SimpleDateFormat formater= new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
        System.out.println(usuario + " --> Registrado a las "+ formater.format(new Date()) + " --> " + servicio);        
    }
}