package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Reserva_Hotel_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.Entities;

public class Reserva {

    private Hospede hospede;
    private Quarto quarto;
    private int diarias;

    public Reserva(Hospede hospede, Quarto quarto, int diarias) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.diarias = diarias;
    }

    public final double calcularValorTotal() {
        double total = quarto.getValorDiaria() * diarias;
        if (diarias > 5) {
            total *= 0.90; // desconto de 10% acima de 5 diarias
        }
        return total;
    }

    public Hospede getHospede() { return hospede; }
    public Quarto getQuarto() { return quarto; }
    public int getDiarias() { return diarias; }

    @Override
    public String toString() {
        return "\nHospede:     " + hospede.getNome()
                + "\nQuarto N.:   " + quarto.getNumero()
                + "\nTipo:        " + quarto.getTipo()
                + "\nDiarias:     " + diarias
                + String.format("\nValor Total: R$ %.2f", calcularValorTotal())
                + (diarias > 5 ? " (10% de desconto aplicado)" : "");
    }
}