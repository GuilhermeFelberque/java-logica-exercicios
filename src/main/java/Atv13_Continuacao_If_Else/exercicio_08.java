package Atv13_Continuacao_If_Else;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade restante de material: ");
        int material = sc.nextInt();

        if (material < 20) {
            System.out.println("Trocar material");
        } else {
            System.out.println("Continuar impressão");
        }
        sc.close();
    }
}
