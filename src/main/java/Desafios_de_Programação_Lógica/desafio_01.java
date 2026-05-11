package Desafios_de_Programação_Lógica;

import java.util.Scanner;

public class desafio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos termos da sequência de Fibonacci deseja gerar ? ");
        int n = sc.nextInt();
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            long atual;
            if (i == 0) {
                atual = a;
            } else if (i == 1) {
                atual = b;
            } else {
                atual = a + b;
                a = b;
                b = atual;
            }
            boolean primo = true;
            if (atual < 2) {
                primo = false;
            } else {
                for (int j = 2; j < atual; j++) {
                    if (atual % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            if (primo) {
                System.out.println(atual + " *");
            } else {
                System.out.println(atual);
            }
        }
        sc.close();
    }
}

