package Atv16_Lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite ENTER para começar o programa");
        sc.nextLine();
        Random rand = new Random();
        int verificacao = rand.nextInt();
        for (int i = 0; i < 200; i++) {
            System.out.println("Peças produzidas: " + i);
            verificacao = rand.nextInt(200);
        }
        System.out.println("Peças defeituosas: " + verificacao);
        double media = (double) verificacao / 200;
        System.out.printf("A media de peças defeituosas são: %.2f%%", media * 100);
        sc.close();
    }
}
