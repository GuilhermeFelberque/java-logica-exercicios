package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities;

public final class Quarto {

    private int numero;
    private TipoQuarto tipo;
    private double valorDiaria;
    private boolean disponivel;

    public Quarto(int numero, TipoQuarto tipo, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    public int getNumero() { return numero; }
    public TipoQuarto getTipo() { return tipo; }
    public double getValorDiaria() { return valorDiaria; }
    public boolean isDisponivel() { return disponivel; }

    public void reservar() {
        disponivel = false;
    }

    @Override
    public String toString() {
        return "\nNumero:       " + numero
                + "\nTipo:         " + tipo
                + "\nValor Diaria: R$ " + String.format("%.2f", valorDiaria)
                + "\nDisponivel:   " + (disponivel ? "Sim" : "Nao");
    }
}

