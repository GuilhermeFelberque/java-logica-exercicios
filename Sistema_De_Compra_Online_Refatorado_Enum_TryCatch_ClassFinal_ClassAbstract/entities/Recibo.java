package Sistema_De_Compra_Online_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

public final class Recibo {
    private int numeroPedido;
    private Double total;
    private String pagamento;
    private String nomeCliente;

    public Recibo(int numeroPedido, Double total, String pagamento, String nomeCliente){
        this.numeroPedido = numeroPedido;
        this.total = total;
        this.pagamento = pagamento;
        this.nomeCliente = nomeCliente;
    }

    public void exibirRecibo(){
        System.out.println("Recibo");
        System.out.println("Pedido N°:" + numeroPedido);
        System.out.println("Cliente" + nomeCliente);
        System.out.println("Pagamento" + pagamento);
        System.out.println("Total:" + total);
        System.out.println("----------------------------------");
    }
}
