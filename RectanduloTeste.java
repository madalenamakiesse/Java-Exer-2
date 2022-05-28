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
public class RectanduloTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo novoRectangulo = new Rectangulo(10, 5);
        novoRectangulo.calcularArea();
        novoRectangulo.calcularPerimetro();
        System.out.println("Área do rectângulo: "+novoRectangulo.getArea()+"\nPerímetro do rectângulo: "+novoRectangulo.getPerimetro());
        novoRectangulo.setLado2(7);
        novoRectangulo.calcularArea();
        novoRectangulo.calcularPerimetro();
        System.out.println("Área do rectângulo: "+novoRectangulo.getArea()+"\nPerímetro do rectângulo: "+novoRectangulo.getPerimetro());
        
    }
    
}
