package Atv16_Lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Aperte ENTER para começar o programa");
        sc.nextLine();
        int soma = 0;
        int media;
        for (int i = 1; i <= 50; i++) {
            int materiais = rand.nextInt(901) + 100;
            System.out.println("O material " + i + " teve consumo de: " + materiais);
            soma += materiais;
        }
        media = soma / 50;
        System.out.println("Estoque médio de materiais foi de: " + media);
        sc.close();
    }
}
