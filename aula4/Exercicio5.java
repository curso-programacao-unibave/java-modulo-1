package src.exercicios.aula4;

import javax.swing.*;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
            Faça um programa onde dados valores para hora, minuto e segundo,
            transforme para segundos todas estas informações e mostre o resultado na tela.
            Exemplo de data: String data = "01:50:30"
         */
        String data = JOptionPane.showInputDialog(null, "Informe a data: ");
        int hora = Integer.parseInt(data.substring(0, 2));
        int minuto = Integer.parseInt(data.substring(3, 5));
        int segundo = Integer.parseInt(data.substring(6, 8));
        int segundos = hora * 3600 + minuto * 60 + segundo;
        JOptionPane.showMessageDialog(null, segundos);
    }
}
