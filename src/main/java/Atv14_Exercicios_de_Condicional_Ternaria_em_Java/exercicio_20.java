package Atv14_Exercicios_de_Condicional_Ternaria_em_Java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println(numero % 2 == 0 ? "Par" : "Ímpar");
        sc.close();
    }
}
