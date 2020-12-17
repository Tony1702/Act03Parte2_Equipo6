/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G02_Pareja_KennethyAnthony_Caso3_PatronVisitor;

/**
 *
 * @author Kenneth
 */
public class CalculoInteres implements IVisitor{

    @Override
    public double visit(ActivoRetornoFijo activo) {        
        return 0;
    }

    @Override
    public double visit(ActivoRetornoVariable activo) {
        return activo.getValor() * activo.getTasaInteres() / 12;
    }
    
}
