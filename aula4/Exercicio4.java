package src.exercicios.aula4;

import javax.swing.*;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
            Escreva um programa que receba como entrada um vetor de inteiros e
            retorne a soma de todos os elementos.
         */
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        JOptionPane.showMessageDialog(null, "A soma dos elementos é: " + soma);
    }
}
