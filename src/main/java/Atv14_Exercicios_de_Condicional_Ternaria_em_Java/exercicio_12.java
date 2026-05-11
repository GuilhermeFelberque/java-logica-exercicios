package Atv14_Exercicios_de_Condicional_Ternaria_em_Java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.println(idade > 18 ? "Maior de iade" : "Menor de idade");
        sc.close();
    }
}
