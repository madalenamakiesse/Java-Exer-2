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
public class CirculoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo novoCirculo = new Circulo(10);
        novoCirculo.calcularArea();
        novoCirculo.calcularPerimetro();
        System.out.println("Área do círculo: "+novoCirculo.getArea()+"\nPerímetro do círculo: "+novoCirculo.getPerimetro());
        novoCirculo.setRaio(4);
        novoCirculo.calcularArea();
        novoCirculo.calcularPerimetro();
        System.out.println("Área do círculo: "+novoCirculo.getArea()+"\nPerímetro do círculo: "+novoCirculo.getPerimetro());
        
    }
    
}
