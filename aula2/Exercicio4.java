package src.exercicios.aula2;

import javax.swing.*;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
        Você deve fazer um programa que leia um valor qualquer e
        apresente uma mensagem dizendo em qual dos seguintes intervalos
        ([0,25], (25,50], (50,75], (75, 100]) este valor se encontra.
        Obviamente se o valor não estiver em nenhum destes intervalos,
        deverá ser impressa a mensagem "Fora de intervalo".
         */
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        if (valor >= 0 && valor <= 25) {
            JOptionPane.showMessageDialog(null, "O valor " + valor + " está no intervalo [0,25].");
        } else if (valor > 25 && valor <= 50) {
            JOptionPane.showMessageDialog(null, "O valor " + valor + " está no intervalo (25,50].");
        } else if (valor > 50 && valor <= 75) {
            JOptionPane.showMessageDialog(null, "O valor " + valor + " está no intervalo (50,75].");
        } else if (valor > 75 && valor <= 100) {
            JOptionPane.showMessageDialog(null, "O valor " + valor + " está no intervalo (75,100].");
        } else {
            JOptionPane.showMessageDialog(null, "O valor " + valor + " está fora dos intervalos.");
        }
    }
}
