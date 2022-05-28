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
public class MainPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa pessoa = new Pessoa ("Mad", 20);
        System.out.println(pessoa.dizerONome());
        System.out.println(pessoa.dizerAIdade());
        pessoa.fazerAniversario();
        System.out.println(pessoa.dizerAIdade());
        String n = "ma";
        System.out.println(n.toString());
        
    }
    
}
