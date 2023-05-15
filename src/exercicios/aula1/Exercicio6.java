package src.exercicios.aula1;

public class Exercicio6 {
    public static void main(String[] args) {
        //Faça um programa onde dado um valor em graus Fahrenheit
        //transforme-o para graus Celsius (lembre-se que a fórmula
        //para transformar um valor dado em graus Celsius para graus
        //Fahrenheit é a seguinte):
        double fahrenheit = 10;
        double celsius =((fahrenheit - 32) * 5) / 9;
        System.out.println("O dia está com " + celsius + "ºC");
    }
}
