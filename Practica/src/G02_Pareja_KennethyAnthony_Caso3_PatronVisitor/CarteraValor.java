/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G02_Pareja_KennethyAnthony_Caso3_PatronVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kenneth
 */
public class CarteraValor extends ActivoFinanciero{
    private List<ActivoFinanciero> hijos;
    private String fecha;

    public CarteraValor(String etiqueta, String fecha) {
        this.descripcion = etiqueta;        
        this.fecha = fecha;
        this.hijos = new ArrayList();
    }
         
    @Override
    public void agregarHijo(ActivoFinanciero elem){
        hijos.add(elem);
    }
    
    @Override
    public boolean removerHijo(String etiq){
        for (ActivoFinanciero hijo : hijos)
            if (hijo.getDescripcion().equals(etiq)){
                hijos.remove(hijo);
                return true;
            }
        return false;
    }

    public List<ActivoFinanciero> getHijos() {
        return hijos;
    }

    public void setHijos(List<ActivoFinanciero> hijos) {
        this.hijos = hijos;
    }                   

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public double accept(IVisitor visitor) {
        double result = 0.0;
        for (ActivoFinanciero hijo : hijos) 
            result += hijo.accept(visitor);
        return result;
    }
    
    @Override
    public String toString(){
        String result = "CarteraValor: " + descripcion + " Fecha: " + fecha;
        for (ActivoFinanciero hijo : hijos) 
            result += "\n" + hijo.toString();
        return result+"\n- ultima linea "+descripcion+" -";
    }
}
