package Atv20_For_Each;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite suas palvras: ");
        String texto = sc.nextLine();
        String[] palavras = texto.split("\\s+ ");
        System.out.println("Palavras sem pontuação:");
        for (String p : palavras) {
            String limpar = p.replaceAll("[.,;!?]", "");
            System.out.println(limpar);
        }
    }
}