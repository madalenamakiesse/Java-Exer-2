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
public class Agenda {
    private Pessoa2[] pessoa = new Pessoa2[10];
    private int i = 0;
    public Agenda(){
        
    }
    void armazenaPessoa(String nome, int idade, float altura){
        pessoa[i] = new Pessoa2();
        pessoa[i].setAltura(altura);
        pessoa[i].setIdade(idade);
        pessoa[i].setNome(nome);
        i++;
    }
    void removePessoa(String nome){
        
        for(int k=buscaPessoa(nome); k<i-1 && pessoa[k+1] != null ; k++){
            pessoa[k].setAltura(pessoa[k+1].getAltura());
            pessoa[k].setIdade(pessoa[k+1].getIdade());
            pessoa[k].setNome(pessoa[k+1].getNome());
            }
            pessoa[i-1].setAltura(0);
            pessoa[i-1].setIdade(0);
            pessoa[i-1].setNome("");
            i--;
        }
   
    int buscaPessoa(String nome){
        for(int j=0; j<i; j++){
            if(nome.equalsIgnoreCase(pessoa[j].getNome())){
                return j;
            }
        }
        return -1;
    }
    
    void imprimeAgenda(){
        System.out.println("");
        for(int j=0; j<i; j++){
            imprimePessoa( j);
        }
    }
    void imprimePessoa(int j){
        System.out.println(pessoa[j].getNome()+", "+pessoa[j].getIdade()+", "+pessoa[j].getAltura());
    }
}
