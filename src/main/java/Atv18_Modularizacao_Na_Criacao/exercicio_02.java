package Atv18_Modularizacao_Na_Criacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Conversor de Temperatura
        double temperatura;
        System.out.println("=== Conversor de Temperatura ===");
        System.out.println("Escolha o tipo de conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite a temperatura a ser convertida: ");
        String entrada = sc.nextLine();
        String[] partes = entrada.trim().split(" ");
        temperatura = Double.parseDouble(partes[0]);
        double resultado;
        if (opcao == 1) {
            resultado = ConversorTemperatura.celsiusParaFahrenheit(temperatura);
            System.out.printf("%.2f °C = %.2f °F%n", temperatura, resultado);
        } else if (opcao == 2) {
            resultado = ConversorTemperatura.fahrenheitParaCelsius(temperatura);
            System.out.printf("%.2f °F = %.2f °C%n", temperatura, resultado);
        } else {
            System.out.println("Opção inválida!");
        }
        sc.close();
    }

    class ConversorTemperatura {
        public static double celsiusParaFahrenheit(double c) {
            return (c * 9 / 5) + 32;
        }

        public static double fahrenheitParaCelsius(double f) {
            return (f - 32) * 5 / 9;
        }
    }
}
