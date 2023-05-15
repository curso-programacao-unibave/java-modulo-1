package src.exercicios.aula1;

public class Exercicio4 {
    public static void main(String[] args) {
        //Fazer um programa que leia o número de um funcionário,
        //seu número de horas trabalhadas, o valor que recebe
        //por hora e calcula o salário desse funcionário.
        //A seguir, mostre o número e o salário do funcionário,
        //com duas casas decimais.
        int numeroDoFuncionario = 1;
        double horasTrabalhadas = 220.5;
        double valorSalarialPorHoras = 20;
        System.out.printf("Olá funcionario " + numeroDoFuncionario + "\n" +
                "Seu Sálario desse mês é de %.2f %n",  (horasTrabalhadas * valorSalarialPorHoras));


    }
}
