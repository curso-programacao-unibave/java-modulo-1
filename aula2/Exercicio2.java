package src.exercicios.aula2;

import javax.swing.*;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
         */
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar.");
        }
    }
}
