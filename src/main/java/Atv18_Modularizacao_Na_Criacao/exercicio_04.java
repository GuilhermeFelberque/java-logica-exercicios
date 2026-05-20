package Atv18_Modularizacao_Na_Criacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Calculadora de Fatorial
        int numero;
        long resultado;
        System.out.println("Calculadora de Fatorial");
        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();
        resultado = CalculadoraFatorial.calcular(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado + ".");
        sc.close();
    }

    class CalculadoraFatorial {
        public static long calcular(int n) {
            long fatorial = 1;
            int i = n;
            while (i > 1) {
                fatorial *= i;
                i--;
            }
            return fatorial;
        }
    }
}
