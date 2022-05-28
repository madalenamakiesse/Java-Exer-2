/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento;

/**
 *
 * @author Madalena Makiesse
 */
public class MainControle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControleRemoto controlR = new ControleRemoto();
        controlR.aumentarCanal();
        controlR.aumentarVolume();
        System.out.println(controlR.getCanal()+" "+controlR.getVolume());
    }
    
}
