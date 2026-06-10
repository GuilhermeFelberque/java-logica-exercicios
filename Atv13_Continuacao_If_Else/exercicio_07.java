package Atv13_Continuacao_If_Else;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso dos pacotes:");
        int peso = sc.nextInt();

        if (peso < 10) {
            System.out.println("Pacote leves");
        } else if (peso <= 30) {
            System.out.println("Pacotes méddios");
        } else if (peso <= 60) {
            System.out.println("Pacotes pesados");
        } else {
            System.out.println("Pacotes muito pesados");
        }
        sc.close();
    }
}
