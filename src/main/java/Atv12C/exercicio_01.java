package Atv12C;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int n1 = sc.nextInt();
        int calculo = n1 * 365;
        System.out.println("Você viveu aproximadamente: " + calculo);
        sc.close();
    }
}
