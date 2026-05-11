package Atv13_Continuacao_If_Else;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a produção de peças por hora: ");
        int peca = sc.nextInt();

        if (peca < 50) {
            System.out.println("Baixo desempenho");
        } else if (peca <= 100) {
            System.out.println("Regular");
        } else {
            System.out.println("Ótimo");
        }
        sc.close();
    }
}
