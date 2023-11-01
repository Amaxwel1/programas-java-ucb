/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.view;

import br.com.controller.Apolice;

/**
 *
 * @author Alexm
 */
public class ApoliceTeste {
    public static void main(String[] args) {
        //Testando praticamente todas as possibilidades, incluindon também o contrutor padrão e um modificado!
        
        Apolice apolice1 = new Apolice("Alex", 19, 1550.0);
        apolice1.calcularPremioApolice();
        apolice1.oferecerDesconto("Brasília");
        apolice1.imprimir();
        
        Apolice apolice2 = new Apolice("João Gabriel", 26, 2300.0);
        apolice2.calcularPremioApolice();
        apolice2.oferecerDesconto("São Paulo");
        apolice2.imprimir();
        
        Apolice apolice3 = new Apolice();
        apolice3.setNomeSegurado("Lucas Santos");
        apolice3.setIdadeSegurado(37);
        apolice3.setValorPremioApolice(2800.0);
        apolice3.calcularPremioApolice();
        apolice3.oferecerDesconto("Rio de Janeiro");
        apolice3.imprimir();
        
        Apolice apolice4 = new Apolice("Ithalo Ribeiro", 28, 1700.0);
        apolice4.calcularPremioApolice();
        apolice4.oferecerDesconto("Goiania");
        apolice4.imprimir();
        
        Apolice apolice5 = new Apolice("Jhonatan", 24, 2300.0);
        apolice5.calcularPremioApolice();
        apolice5.oferecerDesconto("Belo Horizonte");
        apolice5.imprimir();
    }
}
