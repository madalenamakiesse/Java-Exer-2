/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento;
import java.util.*;
/**
 *
 * @author Madalena Makiesse
 */
public class MainPessoa1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Data data = new Data(1, 4, 1990);
        Pessoa1 pessoa = new Pessoa1("Fy Ghh", data, 1.72);
        pessoa.imprimir();
        int anoactual = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Idade: "+pessoa.idade(anoactual));
    } 
}
