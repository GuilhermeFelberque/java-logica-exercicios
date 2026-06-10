package _01_estruturaSequencial;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o código da primeira peça:");
        double a = sc.nextDouble();
        System.out.printf("Insira o código:");
        double b = sc.nextDouble();
        System.out.printf("Insira o preço unitario:");
        double c = sc.nextDouble();
        System.out.printf("Insira o código da segunda peça:");
        double d = sc.nextDouble();
        System.out.printf("Insira o código:");
        double e = sc.nextDouble();
        System.out.printf("Insira o preço unitario:");
        double f = sc.nextDouble();
        double total = (b*c)+(e*f);
        System.out.printf("Valor a pagar: R$ %.2f\n", total);
        sc.close();
    }
}
