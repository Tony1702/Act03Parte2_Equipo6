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
public class CalculoImpuestoRenta implements IVisitor{
    private final double primerTramo = 0.10;
    private final double segundoTramo = 0.25;
    private final double montoLimite = 100000.00;

    @Override
    public double visit(ActivoRetornoFijo activo) {  
        double rentaAnual = activo.getMontoRetorno();
        if (rentaAnual <= montoLimite)
            return rentaAnual * primerTramo;        
        else
            return rentaAnual * segundoTramo;
    }   

    @Override
    public double visit(ActivoRetornoVariable activo) {
        double rentaAnual = activo.getValor()*activo.getTasaInteres();
        if (rentaAnual <= montoLimite)
            return rentaAnual * primerTramo;        
        else
            return rentaAnual * segundoTramo;
    }
    
}
