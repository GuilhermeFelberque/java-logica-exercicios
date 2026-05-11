package Java_1_Lista_Orientacao_a_Objetos.atv5.entities;

public class contaBancaria {
    public String titular;
    public double saldo;

    public contaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depositado de R$: " + valor + " realizado com sucesso");
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void sacar(double valor){
        if (valor > 0){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. ");
        }else {
            System.out.println("Saldo insuficiente ou valor inválido. ");
        }
    }
    public void exibirSaldo(){
        System.out.println("Titular: " + titular + " Saldo atual: R$ " + saldo);
    }
}
