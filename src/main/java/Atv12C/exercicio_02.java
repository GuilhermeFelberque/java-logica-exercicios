package Atv12C;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas: ");
        int n1 = sc.nextInt();
        int calculo = n1 * 60;
        System.out.println("A conversão em minutos é: " + calculo);
        sc.close();
    }
}
