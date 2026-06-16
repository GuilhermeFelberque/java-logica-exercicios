package Java_File_E_Buffered.Diario_De_Jogos_Foco_em_Sintaxe_e_Fluxo_Básico.entities;

public class JogosSalvos {
    private String jogos;

    public JogosSalvos(String jogos) {
        this.jogos = jogos;
    }

    public String jogos() {
        return jogos;
    }

    public void setJogos(String jogos) {
        this.jogos = jogos;
    }

    @Override
    public String toString() {
        return jogos;
    }
}