/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

/**
 *
 * @author Alexm
 */
public class Votacao extends Pessoa {
    private int votosJava = 0, votosC = 0, numPessoas = 0;
    
    @Override
    public void votar(){
        votosJava++;
        numPessoas++;   
    }
    
    public void votar(int votosC){
        votosC = this.votosC++;
        numPessoas++;
    }
    
    public int getVotosC() {
        return votosC;
    }

    public int getVotosJava() {
        return votosJava;
    }

    public int getNumFunc() {
        return numPessoas;
    }
    
}
