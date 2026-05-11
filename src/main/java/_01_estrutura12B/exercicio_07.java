package _01_estrutura12B;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de dias: ");
        int dia = sc.nextInt();
        int calculo = dia * 24;
        System.out.println("Convertido em horas: " + calculo);
        sc.close();
    }
}
