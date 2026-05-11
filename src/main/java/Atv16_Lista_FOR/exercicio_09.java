package Atv16_Lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int soma = 0, previsao;
        double media;
        for (int i = 0; i <= 31; i++) {
            previsao = rand.nextInt(1001);
            System.out.println("Previsão de demanda para o dia " + i + " Foram feitas " + previsao + " unidades");
            soma += previsao;
        }
        media = soma / 31;
        System.out.println("A média de unidades produzidas foram de: " + media);
        sc.close();
    }
}
