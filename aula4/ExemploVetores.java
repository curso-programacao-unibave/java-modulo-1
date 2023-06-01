package src.exercicios.aula4;

import javax.swing.*;

public class ExemploVetores {
    /*
        Fazer um programa para ler um número N e a altura de N pessoas.
        Armazene as N alturas em um vetor.
        Em seguida, mostrar a altura média dessas pessoas.
     */
    public static void main(String[] args) {
        int numeroDeRepeticoes = 5;
        double[] alturas = new double[numeroDeRepeticoes];
        double soma = 0;
        for (int i = 0; i < numeroDeRepeticoes; i++) {
            alturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pessoa " + (i + 1)));
            soma += alturas[i];
        }
        JOptionPane.showMessageDialog(null, "A média das alturas é: " + soma / numeroDeRepeticoes);
    }
}