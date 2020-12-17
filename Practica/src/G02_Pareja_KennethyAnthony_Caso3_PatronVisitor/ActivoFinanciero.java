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
public abstract class ActivoFinanciero {
    protected String descripcion;
        
    public abstract double accept(IVisitor visitor);
    public abstract void agregarHijo(ActivoFinanciero elem);    
    public abstract boolean removerHijo(String etiq);

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }        
}
