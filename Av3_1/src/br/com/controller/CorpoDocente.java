/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

/**
 *
 * @author Alexm
 */
public class CorpoDocente extends Empregado {

    public CorpoDocente(String nome) {
        super(nome);
    }
    
    @Override
    public double fixarSalario(String categoria){
        if("Monitor".equals(categoria)){
            return this.salario = 2200.0;
        } else if("Demonstrador".equals(categoria)){
            return this.salario = 2500.0;
        } else if("Professor".equals(categoria)){
            return this.salario = 5500.0;
        }   
        return this.salario = 0;
    }
}
