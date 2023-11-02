/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.view;

import br.com.controller.CorpoDiscente;
import br.com.controller.CorpoDocente;
import br.com.controller.Estudante;

/**
 *
 * @author Alexm
 */
public class Teste {
    public static void main(String[] args) {
       Estudante e1 = new Estudante("Tempo Integral", 8.5);
       e1.setNome("Alex");
       System.out.println(e1.toString());
       
       System.out.println("\n");
       
       Estudante e2 = new Estudante("Tempo Parcial", 9.5);
       e2.setNome("João");
       System.out.println(e2.toString());
       System.out.println("Foi mal na materia!");
       e2.modificarMedia(7.5);
       System.out.println(e2.toString());
       
       System.out.println("\n");
       
       Estudante e3 = new Estudante("Tempo Parcial", 7.0);
       e3.setNome("Marcos");
       System.out.println(e3.toString());
       System.out.println("Trocou o estatuto!");
       e3.modificarEstatuto("Tempo Integral");
       System.out.println(e3.toString());
       
       System.out.println("\n");

       CorpoDocente cd = new CorpoDocente("Luis");
       cd.fixarSalario("Monitor");
       System.out.println(cd.toString());
       
       System.out.println("\n");

       CorpoDocente cd2 = new CorpoDocente("Kaio");
       cd2.fixarSalario("Professor");
       System.out.println(cd2.toString());
       
       System.out.println("\n");
       
       CorpoDiscente cdis = new CorpoDiscente("Lucas");
       cdis.fixarSalario("Escritório");
       System.out.println(cdis.toString());
       
       System.out.println("\n");

       CorpoDiscente cdis2 = new CorpoDiscente("Jhonatan");
       cdis2.fixarSalario("Manutenção");
       System.out.println(cdis2.toString());
       
    }
}
