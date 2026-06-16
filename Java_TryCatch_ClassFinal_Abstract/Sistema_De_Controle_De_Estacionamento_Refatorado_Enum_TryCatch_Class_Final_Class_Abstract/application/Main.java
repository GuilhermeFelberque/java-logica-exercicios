package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Controle_De_Estacionamento_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.application;

import Java_TryCatch_ClassFinal_Abstract.Sistema_De_Controle_De_Estacionamento_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.entities.Estacionamento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento();
        int opcao;

        do {
            System.out.println("Estacionamento");
            System.out.println("1 - Entrada de veiculo");
            System.out.println("2 - Saida de veiculo");
            System.out.println("3 - Listar veiculos");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opcao: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Digite apenas numeros.");
                sc.nextLine();
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    estacionamento.entradaVeiculo(sc);
                    break;
                case 2:
                    estacionamento.saidaVeiculo(sc);
                    break;
                case 3:
                    estacionamento.listarVeiculos();
                    break;
                case 0:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}