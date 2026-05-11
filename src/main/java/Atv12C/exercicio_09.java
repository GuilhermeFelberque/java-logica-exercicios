package Atv12C;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base maior: ");
        double basemaior = sc.nextDouble();
        System.out.println("Digite a base menor: ");
        double basemenor = sc.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();
        double calculo = (basemaior + basemenor) * altura / 2;
        System.out.println("A área é: " + calculo);
        sc.close();
    }
}
