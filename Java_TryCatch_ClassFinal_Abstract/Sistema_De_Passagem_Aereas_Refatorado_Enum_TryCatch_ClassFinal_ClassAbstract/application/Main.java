package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Passagem_Aereas_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.application;

import Java_TryCatch_ClassFinal_Abstract.Sistema_De_Passagem_Aereas_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities.ClasseEconomica;
import Java_TryCatch_ClassFinal_Abstract.Sistema_De_Passagem_Aereas_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities.ClasseExecutiva;
import Java_TryCatch_ClassFinal_Abstract.Sistema_De_Passagem_Aereas_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities.Passagem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nome do passageiro: ");
            String nome = sc.nextLine();

            System.out.print("Numero do voo: ");
            String voo = sc.nextLine();

            if (nome.trim().isEmpty() || voo.trim().isEmpty()) {
                System.out.println("ERRO: Nome do passageiro e numero do voo nao podem ser vazios.");
                sc.close();
                return;
            }

            System.out.print("Preco da passagem: R$ ");
            double preco = sc.nextDouble();
            sc.nextLine(); // limpar buffer

            System.out.println("1 - Economica");
            System.out.println("2 - Executiva");
            System.out.print("Escolha a classe: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            Passagem passagem = null;

            if (opcao == 1) {
                System.out.print("Deseja despachar mala? (sim/nao): ");
                String resposta = sc.nextLine();
                boolean despacharMala = resposta.equalsIgnoreCase("sim");
                passagem = new ClasseEconomica(nome, voo, preco, despacharMala);

            } else if (opcao == 2) {
                passagem = new ClasseExecutiva(nome, voo, preco);

            } else {
                System.out.println("[ERRO]: Opcao de classe invalida!");
                sc.close();
                return;
            }

            System.out.println(passagem);

        } catch (InputMismatchException e) {
            System.out.println("[ERRO]: Entrada invalida! Verifique os valores numericos digitados.");
        } finally {
            sc.close();
        }
    }
}