package src.exercicios.aula3;

import javax.swing.*;

public class ExemploWhile {
    /*
    Fazer um programa que lê números inteiros até que
    um zero seja lido. Ao final mostra a soma dos
    números lidos
     */
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int soma = 0;
        while (numero != 0) {
            soma += numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        }
        JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma);
    }
}
