package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Controle_De_Estacionamento_Refatorado_Enum_TryCatch_Class_Final_Class_Abstract.entities;

public final class TarifaEstacionamento {

    private TarifaEstacionamento() {
    }

    public static double calcularTarifa(int horas) {
        if (horas <= 1) {
            return 10.0;
        }
        return 10.0 + (horas - 1) * 5;
    }
}