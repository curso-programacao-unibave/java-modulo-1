package src.exercicios.aula1;

import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
        calcule e mostre a diferença do produto de A e B pelo produto de C e D
        segundo a fórmula:
        DIFERENCA = (A * B - C * D)
         */
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: "));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de D: "));
        int diferenca = (a * b - c * d);
        JOptionPane.showMessageDialog(null, "A diferença dos valores é: " + diferenca);
    }
}
