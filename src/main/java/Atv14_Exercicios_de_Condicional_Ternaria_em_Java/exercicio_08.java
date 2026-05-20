package Atv14_Exercicios_de_Condicional_Ternaria_em_Java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();
        String faixa = idade < 12 ? "Infantil" : (idade <= 18 ? "Juvenil" : "Adulto");
        System.out.println("" + faixa);
        sc.close();
    }
}
