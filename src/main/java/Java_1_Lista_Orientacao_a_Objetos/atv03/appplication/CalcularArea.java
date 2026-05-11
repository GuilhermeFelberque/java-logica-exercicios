package Java_1_Lista_Orientacao_a_Objetos.atv03.appplication;

import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        double base = sc.nextDouble();
        System.out.println("Digite o valor da altura: ");
        double altura = sc.nextDouble();

        double resultado = base * altura;
        System.out.printf("O resultado é: " + resultado);
        sc.close();
    }
}