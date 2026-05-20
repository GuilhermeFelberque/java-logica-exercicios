package Atv13_Continuacao_If_Else;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de itens detectados: ");
        int velocidade = sc.nextInt();

        if (velocidade < 10) {
            System.out.println("Lento");
        } else if (velocidade <= 20) {
            System.out.println("Média");
        } else {
            System.out.println("Rápida");
        }
        sc.close();
    }
}
