package src.exercicios.aula4;

import javax.swing.*;

public class Exercicio6 {
    public static void main(String[] args) {
        /*
            Lê 5 nomes e notas de uma turma, calcula e exibe a média das notas da turma e
            em seguida exibe a relação de nomes cuja nota é superior a esta média
         */
        String[] nomes = new String[5];
        double[] notas = new double[5];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome da " + (i + 1) + "ª nota: ");
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (i + 1) + "ª nota: "));
        }

        double media = 0;
        for (int i = 0; i < nomes.length; i++) {
            media += notas[i];
        }
        media /= nomes.length;

        for (int i = 0; i < nomes.length; i++) {
            if (notas[i] > media) {
                System.out.println(nomes[i] + " - " + notas[i]);
            }
        }
    }
}