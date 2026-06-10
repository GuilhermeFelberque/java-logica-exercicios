package _01_estruturaSequencial;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor:");
        int x = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int y = sc.nextInt();
        System.out.println("Digite o terceiro valor:");
        int t = sc.nextInt();
        System.out.println("Digite o quarto valor:");
        int r = sc.nextInt();
        int soma = (x * y - t * r);
        System.out.println("A diferença é:" + soma);
        sc.close();
    }
}
