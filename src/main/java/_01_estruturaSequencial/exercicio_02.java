package _01_estruturaSequencial;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite a area:");
        double raio = sc.nextDouble();
        double area = 3.14159 *raio * raio;
        System.out.println("O resultado é:" + area);
        sc.close();
    }
}
