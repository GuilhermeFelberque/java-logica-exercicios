package Atv13_Continuacao_If_Else;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nível de energia (0 a 100): ");
        int energia = sc.nextInt();

        if (energia < 30) {
            System.out.println("Modo econômico");
        } else if (energia <= 70) {
            System.out.println("Modo normal");
        } else {
            System.out.println("Modo turbo");
        }
        sc.close();
    }
}
