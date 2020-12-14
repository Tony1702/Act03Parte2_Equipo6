package Caso4;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
    public static void main(String[] args) {
            
        List<Persona> list = new ArrayList<>();
        list.add(new Persona(1, "John", "Doe", "hombre"));
        list.add(new Persona(2, "Jan", "Mendez", "hombre"));
        list.add(new Persona(3, "Ericka", "Solano", "mujer"));
        list.add(new Persona(4, "Emma", "Smith", "mujer"));
        list.add(new Persona(5, "Kenneth", "Mendez", "hombre"));

        //tablas.put("people", list);
            
        IExpression query = new Select("name", new From("people"));
        Context ctx = new Context();
        List<String> result = query.interpret(ctx);
        System.out.println(result);

        IExpression query2 = new Select("*", new From("people"));
        List<String> result2 = query2.interpret(ctx);
        System.out.println(result2);

        IExpression query3 = new Select("name", new From("people", new Where(name -> name.toLowerCase().startsWith("d"))));
        List<String> result3 = query3.interpret(ctx);
        System.out.println(result3);
    }
}
