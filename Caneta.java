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
public class Caneta {
    //Propriedades
    private String marca;
    private String cor;
    private double tamanho;
    
    //Métodos
    //Construtor
    public Caneta (String marca, String cor, double tamanho){
        this.cor = cor;
        this.marca = marca;
        this.tamanho = tamanho;
    }
    //Getters
    public String getMarca(){
        return marca;
    }
    public String getCor(){
        return cor;
    }
    public double getTamanho(){
        return tamanho;
    }
    //Setters
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void setCor( String cor){
        this.cor = cor;
    }
    public void setTamanho( double tamanho){
        this.tamanho = tamanho;
    }
}
