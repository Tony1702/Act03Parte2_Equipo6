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

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return id + " " + nombre + " " + apellido + " " + genero;
    }
}
