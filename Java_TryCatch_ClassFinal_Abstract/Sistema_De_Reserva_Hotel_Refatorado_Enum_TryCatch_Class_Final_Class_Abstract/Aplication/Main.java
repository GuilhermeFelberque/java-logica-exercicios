package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Aplication;

import Java_TryCatch_ClassFinal_Abstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities.FormaPagamento;
import Java_TryCatch_ClassFinal_Abstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities.Hospede;
import Java_TryCatch_ClassFinal_Abstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities.Pagamento;
import Java_TryCatch_ClassFinal_Abstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities.Quarto;
import Java_TryCatch_ClassFinal_Abstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities.Reserva;
import Java_TryCatch_ClassFinal_Abstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities.TipoQuarto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Sistema de Reserva de Hotel");

            System.out.print("Nome do hospede: ");
            String nome = sc.nextLine();

            System.out.print("Cidade: ");
            String cidade = sc.nextLine();

            System.out.print("Quantidade de hospedes: ");
            int quantidadeHospedes = sc.nextInt();

            System.out.print("Quantidade de diarias: ");
            int diarias = sc.nextInt();

            System.out.println("Tipos de quarto:");
            System.out.println("1 - SOLTEIRO");
            System.out.println("2 - CASAL");
            System.out.println("3 - LUXO");
            System.out.print("Escolha: ");
            int opcaoQuarto = sc.nextInt();
            sc.nextLine(); // limpar buffer

            TipoQuarto tipo;
            switch (opcaoQuarto) {
                case 1:  tipo = TipoQuarto.SOLTEIRO; break;
                case 2:  tipo = TipoQuarto.CASAL;    break;
                case 3:  tipo = TipoQuarto.LUXO;     break;
                default:
                    System.out.println("Opcao invalida. Definindo CASAL como padrao.");
                    tipo = TipoQuarto.CASAL;
            }

            Quarto quarto = new Quarto(101, tipo, 250.0);

            if (!quarto.isDisponivel()) {
                System.out.println("Nenhum quarto disponivel.");
                return;
            }

            System.out.println("Quarto encontrado:");
            System.out.println(quarto);

            System.out.println("Formas de pagamento:");
            System.out.println("1 - PIX");
            System.out.println("2 - CARTAO");
            System.out.println("3 - DINHEIRO");
            System.out.print("Escolha: ");
            int opcaoPagamento = sc.nextInt();

            FormaPagamento forma;
            switch (opcaoPagamento) {
                case 1:  forma = FormaPagamento.PIX;      break;
                case 2:  forma = FormaPagamento.CARTAO;   break;
                case 3:  forma = FormaPagamento.DINHEIRO; break;
                default:
                    System.out.println("Opcao invalida. Definindo PIX como padrao.");
                    forma = FormaPagamento.PIX;
            }

            Hospede hospede = new Hospede(nome);
            Reserva reserva = new Reserva(hospede, quarto, diarias);
            Pagamento pagamento = new Pagamento(forma);

            System.out.println("Resumo da reserva");
            System.out.println(reserva);

            if (pagamento.validarPagamento()) {
                quarto.reservar();

                System.out.println("Pagamento");
                System.out.println(pagamento);

                System.out.println("Hospedagem registrada com sucesso!");
                System.out.println("Confirmacao enviada por e-mail.");
                System.out.println("Reserva confirmada.");

            } else {
                System.out.println("Pagamento recusado.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: digite apenas numeros nas opcoes e quantidades.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}