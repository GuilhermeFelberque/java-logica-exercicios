package Atv13_Continuacao_If_Else;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o índice de defeito do lote: ");
        int defeito = sc.nextInt();

        if (defeito > 10) {
            System.out.println("Acionar alerta " + defeito + "%");
        } else if (defeito <= 10) {
            System.out.println("Lote aprovado " + defeito + " %");
        }
        sc.close();
    }
}
