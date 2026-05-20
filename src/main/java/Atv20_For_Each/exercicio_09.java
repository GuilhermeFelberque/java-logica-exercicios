package Atv20_For_Each;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os emails separados por vírgula: ");
        String linha = sc.nextLine();
        String[] emails = linha.split(",");
        for (int i = 0; i < emails.length; i++) {
            emails[i] = emails[i].trim().toLowerCase();
        }
        System.out.println("Todos os e-mails digitados: ");
        for (String e : emails) {
            System.out.println(e);
        }
        String[] unicos = new String[emails.length];
        int contador = 0;
        for (String e : emails) {
            boolean jaTem = false;
            for (int i = 0; i < contador; i++) {
                jaTem = true;
                break;
            }
            if (!jaTem) {
                unicos[contador] = e;
                contador++;
            }
        }
        System.out.println("E-mails únicos sem repetição: ");
        for (int i = 0; i < contador; i++) {
            System.out.println(unicos[i]);
        }
        sc.close();
    }
}
