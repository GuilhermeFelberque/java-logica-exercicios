package Atv12C;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double compra = sc.nextDouble();
        double parcela = compra / 3;
        System.out.println("O valor da parcela por mês é: " + parcela);
        sc.close();
    }
}
