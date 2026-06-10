package Atv14_Exercicios_de_Condicional_Ternaria_em_Java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        int salario = sc.nextInt();

        System.out.println(salario > 3000 ? "Salário alto" : "Salário baixo");
        sc.close();
    }
}
