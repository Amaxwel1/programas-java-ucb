/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

/**
 *
 * @author Alexm
 */
public class Pessoa {
    private int idade;
    private double altura;
    private double peso;
    private int sup50anos = 0, contSistema = 0, qtdPessoas = 0, qtdPessoas1020 = 0, qtdPessoasMenor40 = 0;
    private double somaAlturas1020 = 0;
    
    public double calcularMediaAltura(){
        return (this.somaAlturas1020)/this.qtdPessoas1020;
    }
    
    public double caluclarPercentMenor40quilos(){
        return (double)(this.qtdPessoasMenor40)/this.qtdPessoas * 100;
    }

    public double calcularSomaAlturas1020() {
        return somaAlturas1020+= this.getAltura();
    }
     
    public void addContador(){
            this.qtdPessoas++;
            
            if(this.getIdade() > 50){
                this.sup50anos++;
            }
            
            if(getIdade() >= 10 && getIdade() <= 20){
                this.calcularSomaAlturas1020();
                this.qtdPessoas1020++;
            }
            
            if(getPeso() < 40){
                this.qtdPessoasMenor40++;
            }
            
            this.contSistema++;      
    }
    
    public int getQtdPessoasMenor40() {
        return qtdPessoasMenor40;
    }

    
    public int getSup50anos() {
        return sup50anos;
    }

    public int getContSistema() {
        return contSistema;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }


    public int getQtdPessoas1020() {
        return qtdPessoas1020;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
