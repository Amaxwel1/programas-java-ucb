/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

/**
 *
 * @author Alexm
 */
public class Estudante extends Pessoa {
    private String estatuto;
    private double media;
    
    public Estudante(){}
    
    public Estudante(String estatuto, double media){
        this.media = media;
        this.estatuto = estatuto;
    }

    @Override
    public String toString() {
        return "Estudante - "+ getNome() + "\n" + "Estatuto: " + estatuto + "\nMédia: " + media;
    }

    public double modificarMedia(double media){
       return this.media = media;
    }
    
    public String modificarEstatuto(String estatuto){
        return this.estatuto = estatuto;
    }
    
    public String getEstatuto() {
        return estatuto;
    }

    public void setEstatuto(String estatuto) {
        this.estatuto = estatuto;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    
}
