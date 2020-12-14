package Caso4;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String genero;
    
    public Persona(int id, String nombre, String apellido, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return id + " " + nombre + " " + apellido + " " + genero;
    }
}
