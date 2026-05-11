package _01_estruturaSequencial;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de horas trabalhadas:");
        int a = (int) sc.nextDouble();
        System.out.println("Digite o valor que você recebe por horas trabalhadas:");
        double b = sc.nextDouble();
        System.out.println("Digite o valor da soma:");
        double c = sc.nextDouble();
        double soma = b + c;
        System.out.println("Number =" + a);
        System.out.println("Salary =" + b * c);
        sc.close();
    }
}
