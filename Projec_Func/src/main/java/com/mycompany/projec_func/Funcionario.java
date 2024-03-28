/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projec_func;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Funcionario {
    // DECLARAÇÃO DE VARIAVEIS //
    public int idade;
    public int anoatual = 2024;
    public double salario;
    public String nasc;
    
    // CRIAÇÃO DOS MÉTODOS //
    void InformarSalario(){
        salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de seu salário:"));
    }
    void CalcularIdade(){
        nasc = JOptionPane.showInputDialog("Determine a sua data de nacimento como: xx/xx/xxxx");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Insira apenas o ano de seu nascimento para que a sua idade seja estimada:"));
        idade = anoatual - idade;
    }
    
 
}


