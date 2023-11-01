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

    public double calcularMedia(double nota1, double nota2){
       return this.media = (nota1 + nota2)/2;
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
