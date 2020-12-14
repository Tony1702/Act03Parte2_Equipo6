package Caso4;

import java.util.List;

public class Where implements IExpression {

    private String colCondicion;
    private String condicion;

    public Where(String colCondicion, String condicion) {
        this.colCondicion = colCondicion;
        this.condicion = condicion;
    }

    @Override
    public List<String> interpret(Context contexto) {
        contexto.setCondicion(colCondicion,condicion);
        return contexto.buscar();
    }
}
