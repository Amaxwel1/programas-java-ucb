/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

/**
 *
 * @author Alexm
 */
public class Apolice {
    private String nomeSegurado;
    private int idadeSegurado;
    private double valorPremioApolice;

    public Apolice() {}
    
    public Apolice(String nomeSegurado, int idadeSegurado, double valorPremioApolice) {
        this.nomeSegurado = nomeSegurado;
        this.idadeSegurado = idadeSegurado;
        this.valorPremioApolice = valorPremioApolice;
    }

    public void imprimir(){
        System.out.println
            ("\nNome do Segurado: " + this.nomeSegurado + 
             "\nIdade do Segurado: " + this.idadeSegurado + 
             "\nValor do prêmio da Apolice: " + this.valorPremioApolice);
    }
    
    public void calcularPremioApolice(){
        if(this.idadeSegurado >= 18 && this.idadeSegurado <= 25){
            this.valorPremioApolice += (this.valorPremioApolice*20)/100;
        } else if (this.idadeSegurado > 25 && this.idadeSegurado <= 36){
            this.valorPremioApolice += (this.valorPremioApolice*15)/100;
        } else if (this.idadeSegurado > 36){
            this.valorPremioApolice += (this.valorPremioApolice*10)/100;
        } else {
            System.out.println("Não foi possível calcular o prêmio, pois "
                    + "a idade não corresponde!");
        }
    }
    
    public void oferecerDesconto(String cidade){
        switch(cidade){
            case "São Paulo":
                this.valorPremioApolice -= (this.valorPremioApolice * 20/100);
            break;
            case "Rio de Janeiro":
                this.valorPremioApolice -= (this.valorPremioApolice * 15/100);
            break;
            case "Goiania":
                this.valorPremioApolice -= (this.valorPremioApolice * 10/100);
            break;
            case "Belo Horizonte":
                this.valorPremioApolice -= (this.valorPremioApolice * 5/100);
            break;
        }
    }
    
    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdadeSegurado() {
        return idadeSegurado;
    }

    public void setIdadeSegurado(int idadeSegurado) {
        this.idadeSegurado = idadeSegurado;
    }

    public double getValorPremioApolice() {
        return valorPremioApolice;
    }

    public void setValorPremioApolice(double valorPremioApolice) {
        this.valorPremioApolice = valorPremioApolice;
    }
    
    
}
