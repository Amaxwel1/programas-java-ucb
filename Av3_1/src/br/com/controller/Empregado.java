/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

/**
 *
 * @author Alexm
 */
public class Empregado extends Pessoa {
    private double salario;

    public double fixarSalario(Empregado e1){
        return salario;
    }
    
    public double getSalário() {
        return salario;
    }

    public void setSalário(double salário) {
        this.salario = salário;
    }

}
