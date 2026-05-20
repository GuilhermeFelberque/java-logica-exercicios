package Atv12C;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de quilômetros pecorrido: ");
        double quilometro = sc.nextDouble();
        System.out.println("Litros de combustível comsumido por km: ");
        double combustivel = sc.nextDouble();
        double calculo = quilometro / combustivel;
        System.out.println("O consumo médio da gasolina é: " + calculo);
        sc.close();
    }
}
