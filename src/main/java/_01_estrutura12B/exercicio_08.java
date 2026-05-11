package _01_estrutura12B;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int x = sc.nextInt();
        System.out.println("Digite o secundo número: ");
        int y = sc.nextInt();
        int divisao = x / y;
        int resto = x % y;
        System.out.println("Divisão = " + divisao);
        System.out.println("Resto da divisão = " + resto);
        sc.close();
    }
}
