package Atv13_Exercicios_IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a quantidade de defeitos do lote ? ");
        int sensor = sc.nextInt();
        String info = (sensor > 5) ? "Lote reprovado" : "Lote aprovado";
        System.out.println("" + info);
        sc.close();
    }
}
