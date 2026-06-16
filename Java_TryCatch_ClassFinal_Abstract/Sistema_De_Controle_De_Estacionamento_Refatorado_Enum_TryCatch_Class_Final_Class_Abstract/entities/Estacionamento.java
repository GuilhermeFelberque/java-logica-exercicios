package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Controle_De_Estacionamento_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Estacionamento {

    private ArrayList<Veiculo> veiculos = new ArrayList<>();
    private final int totalVagas = 5;

    public void entradaVeiculo(Scanner sc) {
        try {
            if (veiculos.size() >= totalVagas) {
                System.out.println("Estacionamento lotado.");
                return;
            }

            System.out.print("Digite a placa: ");
            String placa = sc.nextLine();

            System.out.print("Digite o tipo do veiculo (carro/moto): ");
            String tipo = sc.nextLine();

            System.out.print("Digite a hora de entrada: ");
            int horaEntrada = sc.nextInt();
            sc.nextLine();

            Veiculo veiculo;

            if (tipo.equalsIgnoreCase("carro")) {
                veiculo = new Carro(placa, horaEntrada);
            } else {
                veiculo = new Moto(placa, horaEntrada);
            }

            veiculos.add(veiculo);
            System.out.println("Veiculo estacionado com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar veiculo.");
            sc.nextLine();
        }
    }

    public void saidaVeiculo(Scanner sc) {
        System.out.print("Digite a placa do veiculo: ");
        String placa = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < veiculos.size(); i++) {
            Veiculo v = veiculos.get(i);

            if (v.getPlaca().equalsIgnoreCase(placa)) {
                encontrado = true;

                try {
                    System.out.print("Digite a hora de saida: ");
                    int horaSaida = sc.nextInt();
                    sc.nextLine();

                    int tempo = horaSaida - v.getHoraEntrada();
                    double valor = v.calcularValor(tempo);

                    System.out.println("Tempo estacionado: " + tempo + " hora(s)");
                    System.out.println("Valor total: R$ " + valor);

                    System.out.print("Pagamento aprovado? (s/n): ");
                    String pagamento = sc.nextLine();

                    if (pagamento.equalsIgnoreCase("s")) {
                        veiculos.remove(i);
                        System.out.println("Saida liberada.");
                    } else {
                        System.out.println("Pagamento nao autorizado.");
                    }

                } catch (Exception e) {
                    System.out.println("Erro ao processar saida.");
                    sc.nextLine();
                }

                break;
            }
        }

        if (!encontrado) {
            System.out.println("Veiculo nao encontrado.");
        }
    }

    public void listarVeiculos() {
        System.out.println("===== VEICULOS ESTACIONADOS =====");

        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veiculo estacionado.");
            return;
        }

        for (int i = 0; i < veiculos.size(); i++) {
            Veiculo v = veiculos.get(i);
            System.out.println(
                    (i + 1)
                            + " | Placa: " + v.getPlaca()
                            + " | Tipo: " + v.getTipo()
                            + " | Hora Entrada: " + v.getHoraEntrada()
            );
        }
    }
}