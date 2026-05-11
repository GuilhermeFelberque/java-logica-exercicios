package Exemplos;

import java.util.Scanner;

public class exemplo_Funcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        funcClass func = new funcClass();
        System.out.println("Enter three numbers: ");
        func.a = sc.nextInt();
        func.b = sc.nextInt();
        func.c = sc.nextInt();

        System.out.println("O número maior é: " + func.max());
    }
}