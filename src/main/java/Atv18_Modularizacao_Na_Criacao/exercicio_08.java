package Atv18_Modularizacao_Na_Criacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Cálculo de Juros Compostos
        int periodos;
        double capital, taxa, resultado;
        System.out.println("Calculadora de Juros Compostos");
        System.out.print("Digite o valor inicial do investimento: ");
        capital = sc.nextDouble();
        if (capital <= 0) {
            System.out.println("Valor inválido! O capital deve ser maior que zero.");
        } else {
            System.out.print("Digite a taxa de juros (% ao período): ");
            taxa = sc.nextDouble();
            if (taxa < 0) {
                System.out.println("Taxa de juros inválida! Deve ser zero ou positiva.");
            } else {
                System.out.print("Digite o número de períodos: ");
                periodos = sc.nextInt();
                if (periodos <= 0) {
                    System.out.println("Número de períodos inválido! Deve ser maior que zero.");
                } else {
                    resultado = CalculadoraJurosCompostos.calcular(capital, taxa, periodos);
                    System.out.printf("O valor final do investimento é: " + resultado);
                }
            }
        }
        sc.close();
    }

    class CalculadoraJurosCompostos {
        public static double calcular(double capital, double taxa, int periodos) {
            double montante = capital;
            int i = 0;
            while (i < periodos) {
                montante += montante * (taxa / 100);
                i++;
            }
            return montante;
        }
    }
}
