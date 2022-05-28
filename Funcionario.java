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
public class Funcionario {
    //Atributos
    private String nome;
    private String sobrenome;
    private int horasTrabalhadas;
    private float valorPorHora;
    
    //Construtor
    public Funcionario( String nome, String sobrenome, int horasTrabalhadas, float valorPorHora){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }
    
    //Métodos
    public String nomeCompleto(){
        return nome+" "+sobrenome;
    }
    public void calcularSalario(){
        System.out.println("Salário: "+valorPorHora*horasTrabalhadas);
    }
    public void incrementarHoras(int horas){
        horasTrabalhadas+=horas;
    }  
}
