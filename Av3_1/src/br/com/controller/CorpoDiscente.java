/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

/**
 *
 * @author Alexm
 */
public class CorpoDiscente extends Empregado {

    public CorpoDiscente(String nome) {
        super(nome);
    }
    
    @Override
    public double fixarSalario(String categoria){
        if("Escritório".equals(categoria)){
            return this.salario = 3200.0;
        } else if("Manutenção".equals(categoria)){
            return this.salario = 2500.0;
        }  
        return this.salario = 0;
    }    
}
