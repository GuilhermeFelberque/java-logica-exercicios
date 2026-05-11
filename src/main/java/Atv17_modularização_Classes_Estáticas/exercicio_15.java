package Atv17_modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double temperatura, vibracao;

        System.out.println("Digite a temperatura em °C: ");
        temperatura = sc.nextInt();
        System.out.println("Digite a vibração: ");
        vibracao = sc.nextInt();
        String resultado = max(temperatura, vibracao);
        System.out.println(resultado);

        sc.close();
    }

    public static String max(double temperatura, double vibracao) {
        String acao;

        if (temperatura > 90 || vibracao > 80) {
            acao = "ALERTA! Máquina em EMERGÊNCIA. Desligar imediatamente.";
        } else {
            acao = "Máquina operando normalmente.";
        }
        return acao;
    }
}
