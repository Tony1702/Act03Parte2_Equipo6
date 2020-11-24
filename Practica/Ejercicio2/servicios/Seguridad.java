package servicios;

public class Seguridad {
    public boolean authorization(String user,String password){
        if(user.equals("Ovega") && password.equals("SuperVegeta2000")){
            System.out.println("Usuario " + user + " autorizado");
            return true;
        }else{
            System.out.println("Usuario " + user + " no autorizado");
            return false;
        }
    }
}