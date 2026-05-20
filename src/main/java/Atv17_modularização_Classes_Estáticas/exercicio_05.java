package Atv17_modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as horas de uso da máquina");
        int urgencia = sc.nextInt();
        String resultado = max(urgencia);
        System.out.println(resultado);

        sc.close();
    }

    public static String max(int urgencia) {
        String acao;

        if (urgencia < 500) {
            acao = "Urgência baixa";
        } else if (urgencia <= 1000) {
            acao = "Urgência media";
        } else {
            acao = "Urgência alta";
        }
        return acao;
    }
}