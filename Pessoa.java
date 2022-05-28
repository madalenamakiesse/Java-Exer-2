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
public class Pessoa {
    //Propriedades
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    //Métodos
    public String dizerONome(){
        return "Olá, meu nome é "+nome+".";
    }
    public String dizerAIdade(){
        return "Olá eu tenho "+idade+" anos.";
    }
    public void fazerAniversario(){
        idade++;
    }
}
