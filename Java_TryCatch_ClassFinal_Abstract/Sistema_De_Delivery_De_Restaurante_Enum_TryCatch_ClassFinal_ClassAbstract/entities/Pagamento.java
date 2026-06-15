package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Delivery_De_Restaurante_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

public abstract class Pagamento {
    private TipoPagamento tipo;

    public Pagamento(TipoPagamento tipo) {
        this.tipo = tipo;
    }

    public TipoPagamento getTipo() {
        return tipo;
    }

    public abstract void processar();

    @Override
    public String toString() {
        return this.tipo.name();
    }
}
