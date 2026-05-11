package Atv13_Continuacao_If_Else;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código da peça (1 a 4): ");
        int codigo = sc.nextInt();

        if (codigo == 1) {
            System.out.println("Peça aprovada");
        } else if (codigo == 2) {
            System.out.println("Peça reprovada");
        } else if (codigo == 3) {
            System.out.println("Peça rebaixada");
        } else if (codigo == 4) {
            System.out.println("Peça em análise manual");
        } else {
            System.out.println("Código inválido");
        }
        sc.close();
    }
}
