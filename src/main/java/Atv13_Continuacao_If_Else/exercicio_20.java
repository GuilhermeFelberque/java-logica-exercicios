package Atv13_Continuacao_If_Else;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o horario do seu turno: ");
        int turnos = sc.nextInt();

        if (turnos < 12) {
            System.out.println("Manhã");
        } else if (turnos <= 18) {
            System.out.println("Tarde");
        } else {
            System.out.println("Noite");
        }
        sc.close();
    }
}
