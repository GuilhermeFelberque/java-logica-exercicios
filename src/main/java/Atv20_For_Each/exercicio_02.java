package Atv20_For_Each;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite suas palavras: ");
        String palavras = sc.nextLine();
        String[] palavect = palavras.split(" ");
        for (String p : palavect) {
            if (p.length() <= 4) {
                System.out.println(p);
                sc.close();
            }
        }
    }
}
