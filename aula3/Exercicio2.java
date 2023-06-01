package src.exercicios.aula3;

public class Exercicio2 {
    //Imprimir os números de 1 a 10 usando o loop while, mas pular o número 7
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i != 7) {
                System.out.println(i);
            }
            i++;
        }
    }
}
