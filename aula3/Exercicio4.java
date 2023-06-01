package src.exercicios.aula3;

import javax.swing.*;

public class Exercicio4 {
    /*
        Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
        Escreva um algoritmo para ler o tipo de combustível abastecido
        (codificado da seguinte forma: 1 .Álcool 2.Gasolina 3.Diesel 4.Fim).
        Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
        deve ser solicitado um novo código (até que seja válido).
        O programa será encerrado quando o código informado for o número 4.
        Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes
        que abasteceram cada tipo de combustível, conforme exemplo.
     */
    public static void main(String[] args) {
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int tipoCombustivel = 0;
        do {
            tipoCombustivel = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de combustível:\n\n" +
                    "1. Álcool\n" +
                    "2. Gasolina\n" +
                    "3. Diesel\n" +
                    "4. Fim"));
            switch (tipoCombustivel) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo de combustível inválido");
                    break;
            }
        } while (tipoCombustivel != 4);
        JOptionPane.showMessageDialog(null, "MUITO OBRIGADO\nAlcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);
    }
}
