package Atv16_Lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Verificação da qualidade de soldagem");
        int soma = 0;
        double media;
        for (int i = 0; i < 50; i++) {
            int minuto = random.nextInt(61);
            System.out.println("Soldagem " + i + " concluída. Tempo gasto: " + minuto + " minutos");
            soma += minuto;
        }
        media = soma / 60;
        System.out.printf("O tempo médio de cada soldagem foi de: " + media);
        sc.close();
    }
}
