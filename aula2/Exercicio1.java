package src.exercicios.aula2;

import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro,
        e depois dizer se este número é negativo ou não.
         */
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não é negativo.");
        }
    }
}
