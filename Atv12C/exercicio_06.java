package Atv12C;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do depósito: ");
        double deposito = sc.nextDouble();
        System.out.println("Digite o valor da taxa: ");
        double taxa = sc.nextDouble();
        double calculo = deposito * (taxa) / 100;
        System.out.println("O rendimento no final do mês será de: " + calculo);
        sc.close();

    }
}
