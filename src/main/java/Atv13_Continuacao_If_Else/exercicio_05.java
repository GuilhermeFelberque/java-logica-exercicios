package Atv13_Continuacao_If_Else;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as horas de uso da máquina");
        int urgencia = sc.nextInt();

        if (urgencia < 500) {
            System.out.println("Urgência baixa");
        } else if (urgencia <= 1000) {
            System.out.println("Urgência media");
        } else {
            System.out.println("Urgência alta");
        }
        sc.close();
    }
}
