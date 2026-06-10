package Atv13_Exercicios_IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a porcentagem da eficiência ? ");
        int eficiencia = sc.nextInt();
        String info = (eficiencia >= 85) ? "Eficiência aceitável" : "Manutenção recomendada";
        System.out.println("" + info);
        sc.close();
    }
}
