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
public class Pessoa2 {
    private String nome;
    private int idade;
    private float altura;
    
    //Construtor
    public Pessoa2(){
        
    }
    public Pessoa2( String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    //Set
    void setNome(String nome){
        this.nome = nome;
    }
    void setIdade( int idade){
        this.idade = idade;
    }
    void setAltura( float altura){
        this.altura = altura;
    }
    //Get
    String getNome(){
        return nome;
    }
    int getIdade(){
        return idade;
    }
    float getAltura(){
        return altura;
    }
}

