package Caso4;

import java.util.List;

public class From implements IExpression {

    private String tabla;
    private Where where;

    public From(String tabla) {
        this.tabla = tabla;
    }

    public From(String tabla, Where where) {
        this.tabla = tabla;
        this.where = where;
    }

    @Override
    public List<String> interpret(Context contexto) {
        contexto.setTable(tabla);
        if (where == null) {
            return contexto.search();
        }
        return where.interpret(contexto);
    }
}
