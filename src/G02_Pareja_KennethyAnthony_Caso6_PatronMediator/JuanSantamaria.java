/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G02_Pareja_KennethyAnthony_Caso6_PatronMediator;

import java.util.ArrayList;

/**
 *
 * @author Tony1
 */
public class JuanSantamaria implements ITorreControl{
    public ArrayList<Avion> aviones = new ArrayList<Avion>();
    
    public JuanSantamaria() {
        
    }
    
    @Override
    public void despegar(Avion avion) {
        aviones.remove(avion);
        for (Avion reportar : aviones){
            reportar.despegarAvion(avion);
        }
    }
    
    @Override
    public void aterrizar(Avion avion) {
        aviones.add(avion);
        for (Avion reportar : aviones){
            if ( reportar != avion){
                reportar.despegarAvion(avion);
            }
        } 
    } 
}
