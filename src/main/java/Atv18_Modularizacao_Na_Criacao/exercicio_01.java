package Atv18_Modularizacao_Na_Criacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Calculadora Simples
        System.out.print("Digite o primeiro número:");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número:");
        double n2 = sc.nextDouble();
        System.out.print("Escolha a operação (+ - * /)");
        String operacao = sc.next();
        double resultado = 0;

        if (operacao.equalsIgnoreCase("+")) {
            resultado = somar(n1, n2);
        } else if (operacao.equalsIgnoreCase("-")) {
            resultado = subtracao(n1, n2);
        } else if (operacao.equalsIgnoreCase("*")) {
            resultado = multiplicacao(n1, n2);
        } else if (operacao.equalsIgnoreCase("/")) {
            resultado = divisao(n1, n2);
        }
        System.out.print(resultado);
        sc.close();
    }

    class Calculadora {

    }

    public static double somar(double n1, double n2) {
        return n1 + n2;
    }

    public static double subtracao(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }

    public static double divisao(double n1, double n2) {
        if (n2 == 0) {
            System.out.print("Erro: divisão por zero");
            return 0;
        }
        return n1 / n2;
    }
}