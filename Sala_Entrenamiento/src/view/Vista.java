/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controlador;

/**
 *
 * @author Tony1
 */
public class Vista {
    private Controlador controlador = new Controlador();
    
    public Controlador getControlador(){
        return controlador;
    }
    
}
