package Atv20_For_Each;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os códigos separados: ");
        String codigos = sc.nextLine();
        String[] vect = codigos.split(" ");
        String alvo;
        do {
            System.out.println("Digite o código que deseja buscar (ou Sair para encerrar): ");
            alvo = sc.nextLine();
            if (alvo.equalsIgnoreCase("Sair")) {
                int cont = 0;
                for (String c : vect) {
                    if (c.equalsIgnoreCase(alvo)) {
                        cont++;
                    }
                }
                System.out.println(" O código " + alvo + " aparece " + cont + " vezes.");
            }
        }
        while (alvo.equalsIgnoreCase("Sair"));
            System.out.println("Programa encerrada.");
            sc.close();
        }
    }
