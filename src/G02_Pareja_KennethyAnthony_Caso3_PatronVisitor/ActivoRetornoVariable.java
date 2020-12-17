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
public class ActivoRetornoVariable extends ActivoFinanciero{
    private double valor;
    private double tasaInteres;   

    public ActivoRetornoVariable(String descripcion, double valor, double tasaInteres) {        
        this.descripcion = descripcion;                
        this.valor = valor;
        this.tasaInteres = tasaInteres;
    }        
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public double accept(IVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public void agregarHijo(ActivoFinanciero elem) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean removerHijo(String etiq) {
       throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String toString(){
        return "ActivoFinanciero: " + descripcion + " Valor: " + valor
                + " TasaInteres: " + tasaInteres;
                
    }
}
