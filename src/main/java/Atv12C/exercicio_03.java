package Atv12C;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o preço: ");
        double n1 = sc.nextInt();
        double desconto = n1 - (n1 * 0.15);
        System.out.println("O valor com desconto é: " + desconto);
        sc.close();
    }
}
