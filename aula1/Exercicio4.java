package src.exercicios.aula1;

import javax.swing.*;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia o número de um funcionário,
        seu número de horas trabalhadas, o valor que recebe
        por hora e calcula o salário desse funcionário.
        A seguir, mostre o número e o salário do funcionário,
        com duas casas decimais.
         */
        int numeroFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do funcionário: "));
        int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de horas trabalhadas: "));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada: "));
        double salario = horasTrabalhadas * valorHora;
        JOptionPane.showMessageDialog(null, "O funcionário " + numeroFuncionario
                + " trabalhou " + horasTrabalhadas + " horas e recebeu R$ " + salario);
    }
}
