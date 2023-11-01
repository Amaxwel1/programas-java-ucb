/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.view;

import br.com.controller.Data;

/**
 *
 * @author Alexm
 */
public class Teste {
    public static void main(String[] args) {
        Data data1 = new Data(10, 05, 2024); // teste com o construtor diferente e ano bissexto
        if(data1.validarData(data1.getDia(), data1.getMes(), data1.getAno())){
           System.out.println(data1.toString()); 
        } else {
            System.out.println("Data Invalida!");
        }
        
        System.out.println("\n");
        
        Data data2 = new Data(); // teste normal sem ser ano bissexto
        data2.setDia(02);
        data2.setMes(02);
        data2.setAno(2005);
        if(data2.validarData(data2.getDia(), data2.getMes(), data2.getAno())){
           System.out.println(data2.toString()); 
        } else {
            System.out.println("Data Invalida!");
        }
        
        System.out.println("\n");
        
        Data data3 = new Data();
        data3.setDia(33); // teste com o dia inexistente
        data3.setMes(02);
        data3.setAno(2005);
        if(data3.validarData(data3.getDia(), data3.getMes(), data3.getAno())){
           System.out.println(data3.toString()); 
        } else {
            System.out.println("Data Invalida!");
        }
        
        System.out.println("\n");
        
        Data data4 = new Data(10, 13, 2024); // teste com o construtor diferente e ano bissexto, por[em mes inexistente
        if(data4.validarData(data4.getDia(), data4.getMes(), data4.getAno())){
           System.out.println(data4.toString()); 
        } else {
            System.out.println("Data Invalida!");
        }

        
    }
}
