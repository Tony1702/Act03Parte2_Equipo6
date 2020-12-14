package Caso4;

import java.util.List;

public class Select implements IExpression {

    private String columna;
    private From from;

    public Select(String columna, From from) {
        this.columna = columna;
        this.from = from;
    }

    @Override
    public List<String> interpret(Context contexto) {
        contexto.setColumn(columna);
        return from.interpret(contexto);
    }

}
