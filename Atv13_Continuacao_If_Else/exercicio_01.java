package Atv13_Continuacao_If_Else;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a situação do sensor frontal (livre/obstaculo): ");
        String sensorF = sc.nextLine();
        System.out.println("Digite a situação do sensor da direita (livre/obstaculo): ");
        String sensorD = sc.nextLine();
        System.out.println("Digite a situação do sensor da esquerda (livre/obstaculo): ");
        String sensorE = sc.nextLine();

        if (sensorF.equalsIgnoreCase("Livre")) {
            System.out.println("Seguir em frente");
        } else {
            if (sensorD.equalsIgnoreCase("Livre")) {
                System.out.println("Desviar para a direita");
            } else {
                if (sensorE.equalsIgnoreCase("Livre")) {
                    System.out.println("Desviar para a esquerda");
                } else {
                    System.out.println("Parar");
                }
            }
        }
        sc.close();
    }
}