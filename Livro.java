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
public class Livro {
    //Propriedades
    private String titulo;
    private int qtdPaginas;
    private int paginasLidas;
    
    //Construtores
    public Livro(){
        
    }
    public Livro( String titulo, int qtdPaginas, int paginasLidas){
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.paginasLidas = paginasLidas;
    }
    
    //Metodos
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public int getQtdPaginas(){
        return qtdPaginas;
    }
    public void setQtdPaginas(int qtdPaginas){
        this.qtdPaginas = qtdPaginas;
    }
    public int getPaginasLidas(){
        return paginasLidas;
    }
    public void setPaginasLidas(int paginasLidas){
        this.paginasLidas=paginasLidas;
    }
    public void verificarProgresso(){
        System.out.println("Você já leu "+(paginasLidas*100/qtdPaginas)+" por cento do livro.");
    }
}
