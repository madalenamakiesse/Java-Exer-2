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
public class Rectangulo {
    //Propriedades
    private float lado1;
    private float lado2;
    private float area;
    private float perimetro;
    
    //Constructor
    public Rectangulo(float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //Métodos
    public void calcularArea(){
        area = lado1*lado2;
    }
    public void calcularPerimetro(){
        perimetro = 2*lado1 + 2*lado2;
    }
    //Setters
    public void setLado1( float lado1){
        this.lado1=lado1;
    }
    public void setLado2( float lado2){
        this.lado2=lado2;
    }
    //Getters
    public float getArea(){
        return area;
    }
    public float getPerimetro(){
        return perimetro;
    }
}
