package src.exercicios.aula2;

import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        Leia 2 valores inteiros (A e B). Após,
        o programa deve mostrar uma mensagem "São Múltiplos" ou "Não são Múltiplos",
        indicando se os valores lidos são múltiplos entre si.
        Atenção: os números devem poder ser digitados em ordem crescente ou decrescente
         */
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));
        if (a % b == 0 || b % a == 0) {
            JOptionPane.showMessageDialog(null, "São múltiplos.");
        } else {
            JOptionPane.showMessageDialog(null, "Não são múltiplos.");
        }
    }
}
