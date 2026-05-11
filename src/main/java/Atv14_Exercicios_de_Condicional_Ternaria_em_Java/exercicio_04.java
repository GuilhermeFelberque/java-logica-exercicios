package Atv14_Exercicios_de_Condicional_Ternaria_em_Java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double temperatura = sc.nextDouble();

        System.out.println(temperatura < 18 ? "Frio" : "Quente");
        sc.close();
    }
}
