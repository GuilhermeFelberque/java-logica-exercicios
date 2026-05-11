package Atv14_Exercicios_de_Condicional_Ternaria_em_Java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        double temperatura = sc.nextDouble();

        System.out.println(temperatura > 30 ? "Quente" : "Frio");
        sc.close();
    }
}
