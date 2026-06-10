package Atv13_Exercicios_IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("qual a quantidade de enrgia captada ? ");
        int energia = sc.nextInt();
        String info = (energia < 200) ? "Adicionar energia auxiliar." : "Energia solar suficiente.";
        System.out.println("" + info);
        sc.close();
    }
}
