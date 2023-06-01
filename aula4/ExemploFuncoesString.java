package src.exercicios.aula4;

import javax.swing.*;

public class ExemploFuncoesString {
    public static void main(String[] args) {
        String texto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("O tamanho do texto da string é: " + texto.length());

        String txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Mostra "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Mostra "hello world"

        String txt1 = "Hello World";
        String txt2 = "Hello World";
        System.out.println(txt1.equals(txt2));   // Mostra true
        //Outro exemplo
        if (txt.equals(txt2)) {
            System.out.println("Verdadeiro");
        }

        char ch;
        String chString;
        chString = JOptionPane.showInputDialog("Digite um char: "); //Caracter
        ch = chString.charAt(0);
        JOptionPane.showMessageDialog(null, ch); //Retorna C que é a primeira letra da chString

        String cidade = "São Ludgero";
        //startsWith
        System.out.println(cidade.startsWith("São")); //Retorna verdadeiro
        //endsWith
        System.out.println(cidade.endsWith("gero")); //Retorna verdadeiro

        String cidade1 = "Capivari De Baixo";
        //Dentro do split especificamos entre aspas qual vai ser o separador
        String[] palavras = cidade1.split(" ");

        System.out.println(palavras[0]); //Mostra Capivari
        System.out.println(palavras[1]); //Mostra De
        System.out.println(palavras[2]); //Mostra Baixo

        String dataNascimento = JOptionPane.showInputDialog("Insira sua data de Nascimento no formato DD/MM/YYYY");
        //Valor armazenado na variável: 11/12/2013
        String[] separacaoData = dataNascimento.split("/");
        System.out.println("Dia: " + separacaoData[0]); //Mostra 11
        System.out.println("Mês: " + separacaoData[1]); //Mostra 12
        System.out.println("Ano: " + separacaoData[2]); //Mostra 2013

        String textoLinha1 = "Oi, tudo bem?\nComo vai você?";
        System.out.println(textoLinha1);
    }
}
