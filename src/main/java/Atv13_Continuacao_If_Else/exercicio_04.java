package Atv13_Continuacao_If_Else;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de usário (operador, supervisor, engenheiro ): ");
        String usuario = sc.nextLine();

        if (usuario.equalsIgnoreCase("operador")) {
            System.out.println("Acesso restrito");
        } else if (usuario.equalsIgnoreCase("supervisor")) {
            System.out.println("Acesso parcial");
        } else if (usuario.equalsIgnoreCase("engenheiro")) {
            System.out.println("Acesso total");
        } else {
            System.out.println("Usuário inválido");
        }
        sc.close();
    }
}
