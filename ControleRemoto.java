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
public class ControleRemoto {
    private Televisao televisao = new Televisao();
    
    public void aumentarCanal(){
        televisao.canal++;
    }
    public void diminuirCanal(){
        televisao.canal--;
    }
    public void aumentarVolume(){
        televisao.volume++;
    }
    public void diminuirVolume(){
        televisao.volume--;
    }
    public void trocarCanal(int canal){
        this.televisao.canal = canal;
    }
    public int getVolume(){
        return televisao.volume;
    }
    public int getCanal(){
        return televisao.canal;
    }
}
