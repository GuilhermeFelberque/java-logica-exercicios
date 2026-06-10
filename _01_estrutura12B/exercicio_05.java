package _01_estrutura12B;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do salário: ");
        double x = sc.nextDouble();
        double calculo = (x * 10) / 100;
        double soma = x + calculo;
        System.out.println("O valor do seu salário com seu aumento é: " + soma);
        sc.close();
    }
}
