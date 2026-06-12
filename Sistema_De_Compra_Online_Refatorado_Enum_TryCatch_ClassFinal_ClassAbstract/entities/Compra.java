package Sistema_De_Compra_Online_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Compra {
    private Cliente cliente;
    private String pagamento;
    private double total = 0;
    private double frete = 0;

    private static int lerInteiro(Scanner sc, String mensagem){
        while (true){
            try {
                System.out.println(mensagem);
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e){
                System.out.println("Erro: Digite apenas números inteiros");
                sc.nextLine();
            }
        }
    }
    private static double lerDouble(Scanner sc, String mensagem){
        while (true){
            try{
                System.out.println(mensagem);
                double valor = sc.nextDouble();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e){
                System.out.println("Erro: Digite apenas numeros");
                sc.nextLine();
            }
        }
    }
    public void adicionarProdutos(){
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            double valorProduto = lerDouble(sc, "Digite o valor do produto");
            int quantidade = lerInteiro(sc, "Digite a quantidade");
            total = total + (valorProduto * quantidade);
            System.out.print("Deseja adicionar outro produto? (s/n): ");
            continuar = sc.next();
        }while (continuar.equalsIgnoreCase("Sim"));
    }
    public void dadosCliente() {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Digite seu endereço: ");
        String endereco = sc.nextLine();

        cliente = new Cliente(nome, cpf, endereco);

        System.out.println("Forma de pagamento:");
        System.out.println("1 - CARTAO");
        System.out.println("2 - PIX");
        System.out.println("3 - BOLETO");
        System.out.println("4 - DINHEIRO");

        int opcao = lerInteiro(sc, "Escolha: ");

        switch (opcao) {
            case 1: pagamento = String.valueOf(FormaDePagamento.CARTAO); break;
            case 2: pagamento = String.valueOf(FormaDePagamento.PIX); break;
            case 3: pagamento = String.valueOf(FormaDePagamento.BOLETO); break;
            case 4: pagamento = String.valueOf(FormaDePagamento.DINHEIRO); break;
            default: System.out.println(" Opção inválida.");
        }
    }
    public void calcularFrete() {
        if (total > 500) {
            System.out.println("Frete grátis!");
        } else {
            frete = 25;
            total = total + frete;
            System.out.println("Frete de R$25 adicionado.");
        }
        System.out.println("Valor total: R$ " + total);
    }

    public void finalizarCompra() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Forma de pagamento aprovada? (s/n): ");
        String aprovado = sc.next();

        if (aprovado.equalsIgnoreCase("s")) {
            int numeroPedido = (int) (Math.random() * 1000);


            Recibo recibo = new Recibo(numeroPedido, total, pagamento, cliente.getNome());
            recibo.exibirRecibo();

            // Exibindo dados do cliente (método abstrato implementado)
            cliente.exibirDados();

        } else {
            System.out.println("Pagamento não autorizado.");
        }
    }
}