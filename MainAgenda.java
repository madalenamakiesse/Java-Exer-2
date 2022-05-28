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
public class MainAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Agenda agenda = new Agenda();
        agenda.armazenaPessoa("Mad", 10, (float) 1.4);
        agenda.armazenaPessoa("Hel", 12, (float) 1.50);
        agenda.armazenaPessoa("Mad", 15, (float) 1.45);
        agenda.imprimeAgenda();
        agenda.removePessoa("Mad");
        agenda.imprimeAgenda();
        System.out.println("");
        System.out.println(agenda.buscaPessoa("Mad"));
        System.out.println("");
        agenda.imprimePessoa(0);
    }
    
}
