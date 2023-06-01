package src.exercicios.aula3;

import javax.swing.*;

public class Exercicio3 {
    /*
        Escreva um programa que repita a leitura de uma senha até que ela seja válida.
        Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
        Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
        e o algoritmo encerrado.
     */
    public static void main(String[] args) {
        int senha = 1234;
        int senhaDigitada = 0;
        do {
            senhaDigitada = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha:"));
            if (senhaDigitada != senha) {
                JOptionPane.showMessageDialog(null, "Senha inválida");
            }
        } while (senhaDigitada != senha);
        JOptionPane.showMessageDialog(null, "Acesso permitido");
    }
}
