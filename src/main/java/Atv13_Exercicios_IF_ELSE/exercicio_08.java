package Atv13_Exercicios_IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nível do óleo ? ");
        int oleo = sc.nextInt();
        String info = (oleo < 30) ? "Adicionar óleo" : "Nível adequado";
        System.out.println("" + info);
        sc.close();
    }
}
