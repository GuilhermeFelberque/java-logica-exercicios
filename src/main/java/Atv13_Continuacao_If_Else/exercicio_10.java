package Atv13_Continuacao_If_Else;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        int temperatura = sc.nextInt();

        if (temperatura < 0) {
            System.out.println("Alerta de congelamento ");
        } else if (temperatura <= 40) {
            System.out.println("Temperatura normal");
        } else {
            System.out.println("Alerta de superaquecimento ");
        }
        sc.close();
    }
}