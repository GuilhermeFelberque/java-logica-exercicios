package Atv13_Continuacao_If_Else;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância detectada pelo sensor: ");
        int sensor = sc.nextInt();

        if (sensor < 5) {
            System.out.println("Precisa freiar");
        } else if (sensor <= 15) {
            System.out.println("Reduzir velocidade");
        } else {
            System.out.println("Precisas acelerar");
        }
        sc.close();
    }
}
