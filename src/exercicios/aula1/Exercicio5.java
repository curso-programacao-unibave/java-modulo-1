package src.exercicios.aula1;

public class Exercicio5 {
    public static void main(String[] args) {
        //Faça um programa em que o usuário informe o nome,
        //o peso e a altura de uma pessoa. Ao final exiba no
        //nome e o índice de Massa Corporal (IMC) da pessoa.
        double peso = 78.35;
        double altura = 1.76;

        System.out.println("Seu IMC é igual a " + (peso/(altura*altura)));
    }
}
