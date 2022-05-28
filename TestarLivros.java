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
public class TestarLivros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Livro livroFavorito = new Livro();
        livroFavorito.setTitulo("Game of Thrones");
        livroFavorito.setQtdPaginas(500);
        System.out.println("O livro "+livroFavorito.getTitulo()+" possui "+livroFavorito.getQtdPaginas()+" páginas.");
        livroFavorito.setPaginasLidas(50);
        livroFavorito.verificarProgresso();
        livroFavorito.setPaginasLidas(250);
        livroFavorito.verificarProgresso();
        Livro livroFavorito1 = new Livro("O Segredo da Morta", 247, 247);
        System.out.println("O livro "+livroFavorito1.getTitulo()+" possui "+livroFavorito1.getQtdPaginas()+" páginas.");
    }
    
}
