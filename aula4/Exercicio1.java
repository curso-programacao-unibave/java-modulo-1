package src.exercicios.aula4;

import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
            Leia um valor inteiro X que seja maior que 1 e menor que 1000.
            Em seguida mostre os ímpares de 1 até X.
         */
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro maior que 1 e menor que  1000: "));
        if (x > 1 && x < 1000) {
            for (int i = 1; i <= x; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Valor inválido");
        }
    }
}
