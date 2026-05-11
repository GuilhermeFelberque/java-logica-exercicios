package Atv16_Lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Controle de manutenção preventiva");
        int soma = 0, ano = 365 * 24, total;
        for (int dia = 1; dia <= 365; dia++) {
            int i = rand.nextInt(ano);
            System.out.println("Dia: " + dia + " com " + i + " horas de operação");
            soma += i;
        }
        total = soma * ano;
        System.out.println("O total de horas de operação foi de: " + total);
        sc.close();
    }
}
