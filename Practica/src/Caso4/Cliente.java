package Caso4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cliente {
	
    public static void main(String[] args) {
        // Se asume que se realiza la carga de informacion desde el archivo Excel
        Map<String, List<Object>> tablas = new HashMap();
        // Esta informacion puede estar contenida en la hoja1
        // se usa una clase auxiliar para garantizar estructura
        List<Object> hoja1 = new ArrayList<>();
        hoja1.add(new Persona(1, "John", "Doe", "hombre"));
        hoja1.add(new Persona(2, "Jan", "Mendez", "hombre"));
        hoja1.add(new Persona(3, "Ericka", "Solano", "mujer"));
        hoja1.add(new Persona(4, "Emma", "Smith", "mujer"));
        hoja1.add(new Persona(5, "Kenneth", "Mendez", "hombre"));                
        tablas.put("Personas", hoja1);
        // Esta informacion puede estar contenida en la hoja2
        // se usa una clase auxiliar para garantizar estructura
        List<Object> hoja2 = new ArrayList<>();
        hoja2.add(new Animal(1, "gato", "Doe"));
        hoja2.add(new Animal(2, "gato", "Zen"));
        hoja2.add(new Animal(3, "perro", "Sol"));
        hoja2.add(new Animal(4, "raton", "Stuart"));        
        tablas.put("Mascotas", hoja2);
        
        // Mecanismo para hacer consultas SQL soportado por el patron Interpreter
        IExpression consulta = new Select("apellido", new From("Personas"));
        Context ctx = new Context(tablas);
        List<String> resultado = consulta.interpret(ctx);
        System.out.println("1. SELECT apellido FROM Personas");
        System.out.println(resultado);

        IExpression consulta2 = new Select("*", new From("Personas"));
        List<String> resultado2 = consulta2.interpret(ctx);
        System.out.println("2. SELECT * FROM Personas");
        System.out.println(resultado2);

        IExpression consulta3 = new Select("nombre", new From("Personas", 
                new Where("genero", "hombre")));        
        List<String> resultado3 = consulta3.interpret(ctx);
        System.out.println("3. SELECT nombre FROM Personas WHERE genero=hombre");
        System.out.println(resultado3);
        
        IExpression consulta4 = new Select("*", new From("Mascotas",
                new Where("id", "4")));
        List<String> resultado4 = consulta4.interpret(ctx);
        System.out.println("4. SELECT * FROM Mascotas WHERE id=4");
        System.out.println(resultado4);
        
        IExpression consulta5 = new Select("nombre", new From("Mascotas", 
                new Where("especie", "gato")));        
        List<String> resultado5 = consulta5.interpret(ctx);
        System.out.println("5.SELECT nombre FROM Mascotas WHERE especie=gato");
        System.out.println(resultado5);                
    }
}
