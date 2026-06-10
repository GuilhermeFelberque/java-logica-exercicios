package Atv13_Exercicios_IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos produtos foram produzidos ? ");
        int produto = sc.nextInt();
        String info = (produto >= 1000) ? "Meta atingida" : "Produção abaixo da meta";
        System.out.println("" + info);
        sc.close();
    }
}
