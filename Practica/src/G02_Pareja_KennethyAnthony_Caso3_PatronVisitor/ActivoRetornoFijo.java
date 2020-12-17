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
public class ActivoRetornoFijo extends ActivoFinanciero{
    private double valor;
    private double montoRetorno;   

    public ActivoRetornoFijo(String descripcion, double valor, double montoRetorno) {        
        this.descripcion = descripcion;                
        this.valor = valor;
        this.montoRetorno = montoRetorno;
    }        
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMontoRetorno() {
        return montoRetorno;
    }

    public void setMontoRetorno(double montoRetorno) {
        this.montoRetorno = montoRetorno;
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
                + " MontoRetorno: " + montoRetorno;
                
    }
}
