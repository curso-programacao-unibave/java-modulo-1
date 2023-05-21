package src.exercicios.aula3;

import javax.swing.*;

public class ExemploDoWhile {
    /*
    Fazer um programa para ler uma temperatura em Celsius e
    mostrar o equivalente em Fahrenheit. Perguntar se o usuário
    deseja repetir (S/N). Caso o usuário digite 's', repetir o
    programa.
     */
    public static void main(String[] args) {
        double celsius, fahrenheit;
        char resposta;
        do {
            celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius: "));
            fahrenheit = (9 * celsius + 160) / 5;
            JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + fahrenheit);
            resposta = JOptionPane.showInputDialog("Deseja repetir o programa? (S/N)").charAt(0);
        } while (resposta == 's' || resposta == 'S');
    }
}
