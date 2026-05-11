package Atv17_LIsta_Do_While;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome ? ");
        sc.nextLine();
        System.out.println("Que nome bonito !");
        System.out.println("Onde vc mora ? ");
        sc.nextLine();
        System.out.println("Que lugar legal !");
        System.out.println("Qual seu CPF ? ");
        sc.nextLine();
        System.out.println("Muito obrigado pela conversa.");
        System.out.println("Parabens ! Agora seu nome está no Serasa. ");
        sc.close();
    }
}
