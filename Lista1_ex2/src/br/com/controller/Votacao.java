/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

/**
 *
 * @author Alexm
 */
public class Votacao {
    private String matricula;
    private int votos44 = 0, votos40 = 0, numFunc = 0;

    public String getMatricula() {
        return matricula;
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

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void votar1(){
        votos40++;
        numFunc++;
        
    }
    
    public void votar2(){
        votos44++;
        numFunc++;
    }
    
    
    
}
