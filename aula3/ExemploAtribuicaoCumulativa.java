package src.exercicios.aula3;

import javax.swing.*;
import java.text.DecimalFormat;

public class ExemploAtribuicaoCumulativa {
    /*
    Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
    dá direito a 100 minutos de telefone. Cada minuto que exceder a
    franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
    quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
    a ser pago.
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Minutos utilizados: "));
        double valorPlano = 50.0;
        if (minutos > 100) {
            // sem atribuição cumulativa:
            // valorPlano = valorPlano + (minutos - 100) * 2.0;
            // com atribuição cumulativa:
            valorPlano += (minutos - 100) * 2.0;
        }
        JOptionPane.showMessageDialog(null, "Valor a pagar: R$ " + df.format(valorPlano));
    }
}
