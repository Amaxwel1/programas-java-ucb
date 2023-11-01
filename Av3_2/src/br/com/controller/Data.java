/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

/**
 *
 * @author Alexm
 */
public class Data {
    private int dia, mes, ano;

    public Data(){}
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    @Override
    public String toString() {
        return "Data: " + dia + "/" + mes + "/" + ano;
    }
    
    public boolean validarData(int dia, int mes, int ano){
        if(dia >= 1 && dia <= 31 && ano > 0 && mes <=12){
            int[] diasMes = {0, 31, 28, 31, 30, 31, 31, 30, 31, 30, 31};
            if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
                diasMes[2] = 29;
                System.out.println("Ano Bissexto");
            }
        return true;
        } return false;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }  
    
}
