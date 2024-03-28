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
public class TestarFunc {
    public static void main(String[] args) {
        // INSTANCIAMENTO DA CLASSE //
        Funcionario func = new Funcionario ();
        
        // VARIÁVEIS //
        String nome = JOptionPane.showInputDialog("Insira o seu nome:");
        
        // CHAMADA DOS MÉTODOS //
        func.CalcularIdade();
        func.InformarSalario();
        
        // EXIBIÇÃOO DAS INFORMAÇÕESS //
        JOptionPane.showMessageDialog(null, " O seu nome é: " + nome + ";\n Você nasceu em: " +func.nasc + "\n Você tem ou fará: " + func.idade + " anos;\n O seu salário é de : R$" +func.salario);
    }
}
