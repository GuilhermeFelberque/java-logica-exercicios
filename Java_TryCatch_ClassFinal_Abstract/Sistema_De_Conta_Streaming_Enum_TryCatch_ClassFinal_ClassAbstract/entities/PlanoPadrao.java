package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Conta_Streaming_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

public final class PlanoPadrao extends ContaStreaming {

    private String qualidadeVideo = "Full HD";
    private int limiteTelas = 2;

    public PlanoPadrao(String nome, String email) {
        super(nome, email, 30.00, TipoPlano.PADRAO);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nQualidade Maxima: " + qualidadeVideo +
                "\nLimite de Telas: " + limiteTelas + " telas" +
                String.format("\nValor Mensal: R$ %.2f\n", getPrecoBase());
    }
}