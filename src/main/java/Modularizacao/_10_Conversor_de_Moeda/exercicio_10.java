package Modularizacao._10_Conversor_de_Moeda;

public class exercicio_10 {
    public double valor;
    private static final double COTACAO_DOLAR = 5.2;
    private static final double COTACAO_EURO = 5.8;

    public double realParaDolar() {
        return valor / COTACAO_DOLAR;
    }

    public double realParaEuro() {
        return valor / COTACAO_EURO;
    }

    public double dolarParaReal() {
        return valor * COTACAO_DOLAR;
    }

    public double euroParaReal() {
        return valor * COTACAO_EURO;
    }
}

