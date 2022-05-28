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
public class Elevador {
    private int andarActual;
    private int totaldeAndares;
    private int capacidade;
    private int qtdPessoa;
    
    //Constructor
    public Elevador(){
        
    }
    public void inicializa( int capacidade, int totaldeAndares){
        this.capacidade = capacidade;
        this.totaldeAndares = totaldeAndares;
        this.qtdPessoa = 0;
        this.andarActual = 0;
    }
    public void entra(){
        if( qtdPessoa < capacidade){
            qtdPessoa++;
        }
    }
    public void sai(){
        if( qtdPessoa > 0){
            qtdPessoa--;
        }
    }
    public void sobe(){
        if(andarActual != totaldeAndares){
            andarActual++;
        }
    }
    public void desce(){
        
        if(andarActual != 0){
            andarActual--;
        }
    }
    public void setCapacidade(int capacidade){
        this.capacidade=capacidade;
    }
    public void setAndarActual( int andar){
        this.andarActual = andar;
    }
    public void setQtdPessoa( int qtdPessoa){
        this.qtdPessoa = qtdPessoa;
    }
    public void setTotaldeAndares(int total){
        this.totaldeAndares = total;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public int getAndarActual(){
        return andarActual;
    }
    public int getTotaldeAndares(){
        return totaldeAndares;
    }
    public int getQuantidadedePessoas(){
        return qtdPessoa;
    }
}
