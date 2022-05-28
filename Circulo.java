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
public class Circulo {
    //Propriedades
    float raio;
    float area;
    float perimetro;
    
    //Construtor
    public Circulo(float raio){
        this.raio = raio;
    }
    //Metodos
    public void calcularArea(){
        area = (float) (3.14*raio*raio);
    }
    public void calcularPerimetro(){
        perimetro = 2*(float) (3.14*raio);
    }
    //Setters
    public void setRaio( float raio){
        this.raio = raio;
    }
    //Getters
    public float getArea(){
        return area;
    }
    public float getPerimetro(){
        return perimetro;
    }
}
