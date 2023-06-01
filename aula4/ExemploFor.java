package src.exercicios.aula4;

import javax.swing.*;

public class ExemploFor {
    /*
        Fazer um programa que lê um valor inteiro N e depois N números inteiros.
        Ao final, mostra a soma dos N números lidos.
     */
    public static void main(String[] args) {
        int numero = 5;
        int soma = 0;
        for (int i = 0; i < numero; i++) {
            soma += i;
        }
        JOptionPane.showMessageDialog(null, "A soma dos " + numero + " primeiros números é: " + soma);
    }
}
