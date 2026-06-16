package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Controle_De_Estacionamento_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.entities;

public class Moto extends Veiculo {

    public Moto(String placa, int horaEntrada) {
        super(placa, horaEntrada, TipoVeiculo.MOTO);
    }

    @Override
    public double calcularValor(int horas) {
        double valor = TarifaEstacionamento.calcularTarifa(horas);
        return valor * 0.8;
    }
}