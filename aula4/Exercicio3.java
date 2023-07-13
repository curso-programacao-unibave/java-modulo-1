package src.exercicios.aula4;

import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
            Ler um número inteiro N e calcular todos os seus divisores.
         */
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                JOptionPane.showMessageDialog(null, "O número " + n + " é divisível por " + i);
            }
        }
    }
}
