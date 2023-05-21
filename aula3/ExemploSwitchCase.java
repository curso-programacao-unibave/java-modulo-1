package src.exercicios.aula3;

import javax.swing.*;

public class ExemploSwitchCase {
    /*
    Fazer um programa para ler um valor inteiro de 1 a 7 representando um
    dia da semana (sendo I=domingo, 2=segunda, e assim por diante).
    Escrever na tela o dia da semana correspondente, conforme exemplos.
     */
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7: "));
        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Segunda");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Terça");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Quarta");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Quinta");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sexta");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Sábado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número inválido");
        }
    }
}
