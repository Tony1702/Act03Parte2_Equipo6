package Caso4;

import java.util.List;

public class Select implements IExpression {

    private String columna;
    private IExpression from;

    public Select(String columna, IExpression from) {
        this.columna = columna;
        this.from = from;
    }

    @Override
    public List<String> interpret(Context contexto) {
        contexto.setColumna(columna);
        return from.interpret(contexto);
    }
}
