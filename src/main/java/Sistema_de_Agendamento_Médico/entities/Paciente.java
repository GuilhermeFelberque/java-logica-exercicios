package Sistema_de_Agendamento_Médico.entities;

public class Paciente {

    private String CPF;
    private String nomePaciente;

    public Paciente(String CPF, String nomePaciente) {

        this.CPF = CPF;
        this.nomePaciente = nomePaciente;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

}