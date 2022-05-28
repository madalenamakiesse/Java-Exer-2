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
public class MainElevador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Elevador elevador = new Elevador();
        elevador.inicializa(8, 10);
        System.out.println(elevador.getCapacidade()+"");
        
    }
    
}
