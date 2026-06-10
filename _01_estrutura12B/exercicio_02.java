package _01_estrutura12B;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double x = sc.nextDouble();
        double multiplicacao = x * 2;
        System.out.println("Multiplicação = " + multiplicacao);
        sc.close();
    }
}