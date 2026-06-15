package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Delivery_De_Restaurante_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

public final class Pix extends Pagamento {
    public Pix() {
        super(TipoPagamento.PIX);
    }

    @Override
    public void processar() {
        System.out.println("Gerando chave Pix ");
    }
}
