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
public class AplicacionFinanciera {
    public static void main(String[] args) {                                     
        
       ActivoFinanciero producto1 = new ActivoRetornoFijo("BonoB1", 550000, 10000);
       ActivoFinanciero producto2 = new ActivoRetornoVariable("BonoB2", 220000, 0.11);
       ActivoFinanciero producto3 = new ActivoRetornoFijo("AccionesA1", 30000, 0);
       ActivoFinanciero producto4 = new ActivoRetornoFijo("AccionesA2", 120000, 0);
       ActivoFinanciero producto5 = new ActivoRetornoVariable("FondoF1", 1250000, 0.2);
       ActivoFinanciero producto6 = new ActivoRetornoVariable("CertificadoC1", 200000, 0.09);       
       ActivoFinanciero subpaquete1 = new CarteraValor("Bonos", "01/10/2020");
       ActivoFinanciero paquete1 = new CarteraValor("PaqueteBasico", "01/10/2020");              
       ActivoFinanciero paquete2 = new CarteraValor("PaqueteEjecutivo", "01/10/2020");
       ActivoFinanciero paquete3 = new CarteraValor("PaqueteCorporativo", "01/10/2020");                     
       
       paquete1.agregarHijo(producto1);
       paquete1.agregarHijo(producto5);
       
       paquete2.agregarHijo(producto2);
       paquete2.agregarHijo(producto3);
       paquete2.agregarHijo(producto6);
       
       subpaquete1.agregarHijo(producto1);
       subpaquete1.agregarHijo(producto2);
       paquete3.agregarHijo(subpaquete1);
       paquete3.agregarHijo(producto3);
       paquete3.agregarHijo(producto4);       
       paquete3.agregarHijo(producto5);
       paquete3.agregarHijo(producto6);
                     
       IVisitor precio = new CalculoPrecio();
       IVisitor impRenta = new CalculoImpuestoRenta();
       IVisitor interes = new CalculoInteres();
       
       System.out.println("----------------------------------------------------");
       System.out.println(paquete3.toString());
       System.out.println("Precio total: " + paquete3.accept(precio));
       System.out.println("Monto interes mensual: " + paquete3.accept(interes));
       System.out.println("Monto renta anual: "+paquete3.accept(impRenta));       
       
    }
        
            
}
