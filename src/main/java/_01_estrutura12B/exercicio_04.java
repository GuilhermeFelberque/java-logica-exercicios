package _01_estrutura12B;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        double base = sc.nextDouble();
        System.out.println("Digite o valor da altura: ");
        double altura = sc.nextDouble();
        double calculo = (base * altura) / 2;
        System.out.println("O valor da sua área é: " + calculo);
        sc.close();
    }
}
