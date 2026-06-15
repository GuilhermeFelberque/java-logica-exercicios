package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Passagem_Aereas_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

public abstract class Passagem {
    private String nomePassageiro;
    private String numeroVoo;
    private double precoOriginal;
    private TipoClasse tipoClasse;

    public Passagem(String nomePassageiro, String numeroVoo, double precoOriginal, TipoClasse tipoClasse) {
        this.nomePassageiro = nomePassageiro;
        this.numeroVoo = numeroVoo;
        this.precoOriginal = precoOriginal;
        this.tipoClasse = tipoClasse;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public double getPrecoOriginal() {
        return precoOriginal;
    }

    public void setPrecoOriginal(double precoOriginal) {
        this.precoOriginal = precoOriginal;
    }

    public TipoClasse getTipoClasse() {
        return tipoClasse;
    }

    public abstract double calcularPrecoFinal();

    @Override
    public String toString() {
        return "Passageiro: " + nomePassageiro + "Número do voo: " + numeroVoo + "Classe: " + tipoClasse;
    }
}