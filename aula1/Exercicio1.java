package src.exercicios.aula1;

import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler dois valores inteiros,
        e depois mostrar na tela a soma desses números
        com uma mensagem explicativa, conforme exemplos.
         */
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        int valorTotal = valor1 + valor2;
        JOptionPane.showMessageDialog(null, "A soma dos valores é: " + valorTotal);
    }
}
