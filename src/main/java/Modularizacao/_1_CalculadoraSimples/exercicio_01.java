package Modularizacao._1_CalculadoraSimples;

public class exercicio_01 {
    public double n1;
    public double n2;
    public String operacao;

    public double calcular() {
        double resultado = 0;

        switch (operacao) {
            case "+":
                resultado = somar();
                break;
            case "-":
                resultado = subtrair();
                break;
            case "*":
                resultado = multiplicar();
                break;
            case "/":
                resultado = dividir();
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }

        return resultado;
    }

    public double somar() {
        return n1 + n2;
    }

    public double subtrair() {
        return n1 - n2;
    }

    public double multiplicar() {
        return n1 * n2;
    }

    public double dividir() {
        if (n2 == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return n1 / n2;
    }
}