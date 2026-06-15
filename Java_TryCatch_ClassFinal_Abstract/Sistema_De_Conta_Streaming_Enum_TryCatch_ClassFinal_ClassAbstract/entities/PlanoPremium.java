package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Conta_Streaming_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

public final class PlanoPremium extends ContaStreaming {

    private String qualidadeVideo = "4K Ultra HD";
    private int limiteTelas = 4;
    private boolean permiteDownload = true;

    public PlanoPremium(String nome, String email) {
        super(nome, email, 50.00, TipoPlano.PREMIUM);
    }

    @Override
    public String toString() {
        String statusDownload = permiteDownload ? "Ativo (Permite assistir offline)" : "Inativo";

        return super.toString() +
                "\nQualidade Maxima: " + qualidadeVideo +
                "\nLimite de Telas: " + limiteTelas + " telas" +
                "\nDownload Offline: " + statusDownload +
                String.format("\nValor Mensal: R$ %.2f\n", getPrecoBase());
    }
}