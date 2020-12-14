package Caso4;

import java.util.List;

public class From implements IExpression {

    private String tabla;
    private IExpression where;

    public From(String tabla) {
        this.tabla = tabla;
    }

    public From(String tabla, IExpression where) {
        this.tabla = tabla;
        this.where = where;
    }

    @Override
    public List<String> interpret(Context contexto) {
        contexto.setTabla(tabla);
        if (where == null) {
            return contexto.buscar();
        }
        return where.interpret(contexto);
    }
}
