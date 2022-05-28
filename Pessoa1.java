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
public class Pessoa1 {
    private String nome;
    private Data data_de_nascimento = new Data();
    private double altura;
   //Construtor 
   public Pessoa1( ){
        
    }
    public Pessoa1(String nome, Data data, double altura){
        this.nome = nome;
        this.data_de_nascimento = data;
        this.altura = altura;
    }
    //Gets
    public String getNome(){
        return nome;
    }
    public Data getData(){
        return data_de_nascimento;
    }
    public double getAltura(){
        return altura;
    }
    // set
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setData(Data data){
        this.data_de_nascimento = data;
        
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public void imprimir(){
        System.out.println("Nome: "+nome+"\nData de nascimento: "+data_de_nascimento.ano+"/"+data_de_nascimento.mes+"/"+data_de_nascimento.dia+"\nAltura: "+altura);
    }
    public int idade (int anoactual){
        return (anoactual - data_de_nascimento.ano);
    }
}
