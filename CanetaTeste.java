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
public class CanetaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta caneta = new Caneta("Bravo", "Azul", 1.8);
        System.out.println("Marca: "+caneta.getMarca()+"\nCor: "+caneta.getCor()+"\nTamanho: "+caneta.getTamanho());
        caneta.setCor("Preta");
        System.out.println("Marca: "+caneta.getMarca()+"\nCor: "+caneta.getCor()+"\nTamanho: "+caneta.getTamanho());
        
    }
    
}
