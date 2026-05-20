package Java_1_Lista_Orientacao_a_Objetos.atv4.entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidadeEstoque;

    public Produto(String nome,double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public void exibirResumo(){
        double valorTotal = preco * quantidadeEstoque;
        System.out.println("Resumo do Produto");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("Valor Total em Estoque: R$ " + valorTotal);
    }
}
