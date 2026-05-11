package Modularizacao._2_Conversor_de_Temperatura;

public class exercicio_02 {
    public int opcao;
    public double temperatura;

    public void converter() {
        double resultado;

        if (opcao == 1) {
            resultado = celsiusParaFahrenheit(temperatura);
            System.out.printf("%.2f °C = %.2f °F%n", temperatura, resultado);
        } else if (opcao == 2) {
            resultado = fahrenheitParaCelsius(temperatura);
            System.out.printf("%.2f °F = %.2f °C%n", temperatura, resultado);
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public double celsiusParaFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public double fahrenheitParaCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}