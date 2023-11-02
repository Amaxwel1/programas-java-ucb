/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

/**
 *
 * @author Alexm
 */
public abstract class Empregado extends Pessoa {
    protected double salario;

    public Empregado(String nome) {
        this.setNome(nome);
    }

    @Override
    public String toString() {
        return "Empregado - "+ getNome() + "\nSalario: " + salario;
    }
   
    public abstract double fixarSalario(String categoria);
    
    public double getSalário() {
        return salario;
    }

    public void setSalário(double salário) {
        this.salario = salário;
    }

}
