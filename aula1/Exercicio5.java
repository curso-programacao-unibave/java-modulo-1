package src.exercicios.aula1;

import javax.swing.*;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
        Faça um programa em que o usuário informe o nome,
        o peso e a altura de uma pessoa. Ao final exiba no
        nome e o índice de Massa Corporal (IMC) da pessoa.
         */
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
        double altura =  Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        double imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc);
    }
}
