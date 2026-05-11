package Atv13_Exercicios_IF_ELSE;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a porcentagem da energia do robô ? " + "%");
        int robo = sc.nextInt();
        String info = (robo >= 50) ? "Robô iniciando pintura" : "Energia insuficiente";
        System.out.println("" + info);
        sc.close();
    }
}
