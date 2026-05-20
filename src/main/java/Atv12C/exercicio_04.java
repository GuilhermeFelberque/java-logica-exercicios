package Atv12C;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double x = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double y = sc.nextDouble();
        double media = (x * 3 + y * 2) / 5;
        System.out.println("A média ponderada é: " + media);
        sc.close();
    }
}
