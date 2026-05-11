package Atv19_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Digite os números: ");
        int n = sc.nextInt();
        boolean verific = false;
        for (int i = 0; i < 5; i++) {
            if (n == numeros[i]) {
                verific = true;
                break;
    }
}
