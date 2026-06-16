package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Controle_De_Estacionamento_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.entities;

public class Carro extends Veiculo {

    public Carro(String placa, int horaEntrada) {
        super(placa, horaEntrada, TipoVeiculo.CARRO);
    }

    @Override
    public double calcularValor(int horas) {
        return TarifaEstacionamento.calcularTarifa(horas);
    }
}