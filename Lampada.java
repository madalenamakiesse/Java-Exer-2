/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento;
import enums.TipoDLampadas.Tipo;
/**
 *
 * @author Madalena Makiesse
 */
public class Lampada {
    //Propriedades
    private Tipo tipo;
    int voltagem;
    String cor;
    String marca;
    double preco;
    int potencia;
    boolean status;
    
    //Métodos
    //Construtores
    public Lampada(){
        
    }
    public Lampada(Tipo tipo, int voltagem, String cor, String marca, double preco, int potencia, boolean status){
        this.tipo = tipo;
        this.cor = cor;
        this.marca = marca;
        this.potencia = potencia;
        this.preco = preco;
        this.status = status;
        this.voltagem = voltagem;
    }

    //Setters
    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }
    public void setCor( String cor){
        this.cor = cor;
    }
    public void setMarca( String marca){
        this.marca = marca;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    public void setPreco( double preco){
        this.preco = preco;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public void setVoltagem( int voltagem){
        this.voltagem = voltagem;
    }
    //Getters
    public Tipo getTipo(){
        return tipo;
    }
    public String getCor(){
        return cor;
    }
    public String getMarca(){
        return marca;
    }
    public int getPotencia(){
        return potencia;
    }
    public double getPreco(){
        return preco;
    }
    public boolean getStatus(){
        return status;
    }
    public int getVoltagem(){
        return voltagem;
    }
}
