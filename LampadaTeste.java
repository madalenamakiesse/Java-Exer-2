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
public class LampadaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lampada[] lampada = new Lampada[2];
        lampada[0] = new Lampada(Tipo.LED, 220, "Branca", "Philes", 159.00, 110, true); 
        lampada[1] = new Lampada(Tipo.FLUORESCENTE, 220, "Branca", "Philes", 150.00, 120, true); 
        //Maior potencia
        int mP = lampada[0].getPotencia()>lampada[1].getPotencia()?1:2;
        //Mais cara
        int mC = lampada[0].getPreco()>lampada[1].getPreco()?1:2;
        
        for(int i =0; i<2; i++){
            System.out.println("Lampada "+(i+1)+": "+lampada[i].getCor()+", "+lampada[i].getMarca()+", "+lampada[i].getPotencia()+", "+lampada[i].getPreco()+", "+lampada[i].getStatus()+", "+lampada[i].getTipo()+", "+lampada[i].getVoltagem());
        }
        System.out.println("A lâmpada com maior potÊncia é a lâmpada "+mP+". A lâmpada mais cara é a lâmpada "+mC+".");
    }
    
}
