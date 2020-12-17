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
public interface IVisitor {    
    public double visit(ActivoRetornoFijo activo);
    public double visit(ActivoRetornoVariable activo);
}
