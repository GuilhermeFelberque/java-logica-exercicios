package Atv14_Exercicios_de_Condicional_Ternaria_em_Java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        double nota = sc.nextDouble();

        System.out.println(nota > 7 ? "Aprovada" : "Reprovado");
        sc.close();
    }
}
