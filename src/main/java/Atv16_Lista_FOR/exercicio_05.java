package Atv16_Lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Controle de consumo de enrgia");
        Random rand = new Random();
        double soma = 0, media;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Máquina" + i + " verificada ");
            for (int hora = 1; hora <= 24; hora++) {
                int consumo = rand.nextInt(201);
                System.out.println("Em " + hora + " a máquina " + i + " teve a media de consumo de: " + consumo + "kWh");
                soma += consumo;
            }
        }
        media = soma / 50;
        System.out.printf("A media de consumo das máquinas foram de: " + media);
        sc.close();
    }
}
