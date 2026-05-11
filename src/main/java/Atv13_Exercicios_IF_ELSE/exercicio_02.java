package Atv13_Exercicios_IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informa a quantidade de unidades no estoque: ");
        int estoque = sc.nextInt();
        String info = (estoque < 20) ? "Reabastecer imediatamente" : "Estoque insuficiente";
        System.out.println("Quantidade no estoque: " + info);
        sc.close();
    }
}
