package _01_estrutura12B;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int x = sc.nextInt();
        int calculo = x *12;
        System.out.println("Sua idade em meses é: " + calculo);
        sc.close();
    }
}
