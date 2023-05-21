package src.exercicios.aula1;

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0000");
        /*
        Faça um programa para ler o valor do raio de um círculo,
        e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
         */
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
        double pi = 3.14159; // poderia ser double pi = Math.PI;
        double area = pi * (raio * raio);
        JOptionPane.showMessageDialog(null, "A área do círculo é: " + df.format(area));
    }
}
