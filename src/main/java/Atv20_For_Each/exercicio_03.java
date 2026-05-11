package Atv20_For_Each;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos preços desejar digitar ?");
        int n = sc.nextInt();
        double[] preco = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Preços" + (i + 1) + " :");
            preco[i] = sc.nextDouble();
        }
        double soma = 0;
        System.out.println("Preços digitados");
        for (double p : preco) {
            System.out.println(p);
            soma += p;
        }
        double media = soma / n;
        System.out.println("Média dos preços é: " + media);
        sc.close();
    }
}
