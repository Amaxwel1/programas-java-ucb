/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

/**
 *
 * @author Alexm
 */
public class Votacao extends Funcionario {
    private int votos44 = 0, votos40 = 0, numFunc = 0;
    
    @Override
    public void votar(){
        votos40++;
        numFunc++;   
    }
    
    public void votar(int votos44){
        votos44 = this.votos44++;
        numFunc++;
    }
    
    public int getVotos44() {
        return votos44;
    }

    public int getVotos40() {
        return votos40;
    }

    public int getNumFunc() {
        return numFunc;
    }
    
}
