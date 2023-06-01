package src.exercicios.aula3;

public class Exercicio1 {
    //Imprimir os números pares de O a 20 usando o loop do-while
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 20);
    }
}
