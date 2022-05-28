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
public class FuncionarioTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario funcionario = new Funcionario("Lionel", "Messi", 10, (float)25.50);
        System.out.println(funcionario.nomeCompleto());
        funcionario.calcularSalario();
        funcionario.incrementarHoras(8);
        funcionario.calcularSalario();
    } 
}
