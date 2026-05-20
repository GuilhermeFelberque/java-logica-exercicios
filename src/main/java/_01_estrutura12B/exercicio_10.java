package _01_estrutura12B;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeino número: ");
        double x = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double y = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double z = sc.nextDouble();
        double calculo = x + y + z / 3;
        System.out.println("A media é: " + calculo);
    }
}
