package Atv13_Exercicios_IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a sua velocidade ? ");
        int velocidade = sc.nextInt();
        String info = (velocidade > 120) ? "Reduzir a velocidade" : "Velocidade adequada";
        System.out.println("" + info);
        sc.close();
    }
}
