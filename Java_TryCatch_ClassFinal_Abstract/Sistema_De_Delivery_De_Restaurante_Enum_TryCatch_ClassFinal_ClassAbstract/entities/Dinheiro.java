package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Delivery_De_Restaurante_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

public final class Dinheiro extends Pagamento {
    public Dinheiro() {
        super(TipoPagamento.DINHEIRO);
    }

    @Override
    public void processar() {
        System.out.println("Separe o valor em dinheiro. O entregador levará troco se necessário");
    }
}
