package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Delivery_De_Restaurante_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

public final class Cartao extends Pagamento {
    public Cartao() {
        super(TipoPagamento.CARTAO);
    }

    @Override
    public void processar() {
        System.out.println(" Conectando com a maquininha de cartão ");
    }
}
