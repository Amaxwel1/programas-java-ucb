/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

/**
 *
 * @author Alexm
 */
public class Calculos {
    private double custoFabrica;

    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }
    
    public double calcularCusto(){
        return this.getCustoFabrica() + (this.getCustoFabrica()*0.28 + this.getCustoFabrica()*0.45);
    }
    
}
