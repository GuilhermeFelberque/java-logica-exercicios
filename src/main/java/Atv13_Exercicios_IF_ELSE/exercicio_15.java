package Atv13_Exercicios_IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("qual a porcentagem de peças aprovadas ? ");
        int porcentagem = sc.nextInt();
        String info = (porcentagem < 90) ? "Qualidade abaixo do padrão." : "Qualidade aceitável.";
        System.out.println("" + info);
        sc.close();
    }
}
