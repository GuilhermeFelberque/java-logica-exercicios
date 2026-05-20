package _01_estrutura12B;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a área: ");
        double raio = sc.nextDouble();
        double area = 3.14 * raio * raio;
        System.out.println("O resultado é: " + area);
        sc.close();
    }
}
