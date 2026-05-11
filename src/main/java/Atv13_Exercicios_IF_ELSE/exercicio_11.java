package Atv13_Exercicios_IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Você detectou o operador ?");
        String operador = sc.nextLine();
        if (operador.equalsIgnoreCase("sim")) {
            System.out.println("Pausar linha de produção.");
        } else {
            System.out.println("Linha operando normalmente");
        }
        sc.close();
    }
}
