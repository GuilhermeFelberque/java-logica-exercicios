package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities;

public final class Pagamento {

    private FormaPagamento formaPagamento;
    private boolean aprovado;

    public Pagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
        this.aprovado = false;
    }

    public boolean validarPagamento() {
        aprovado = true;
        return aprovado;
    }

    public FormaPagamento getFormaPagamento() { return formaPagamento; }
    public boolean isAprovado() { return aprovado; }

    @Override
    public String toString() {
        return "\nForma de Pagamento: " + formaPagamento
                + "\nStatus:             " + (aprovado ? "Aprovado" : "Recusado");
    }
}