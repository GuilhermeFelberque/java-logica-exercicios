package Java_1_Lista_Orientacao_a_Objetos.atv05.appplication;
import Java_1_Lista_Orientacao_a_Objetos.atv05.entities.contaBancaria;
public class conta {
    public static void main(String[] args) {
        contaBancaria joao = new contaBancaria("João Silva", 1000.0);
        joao.exibirSaldo();
        joao.depositar(500.0);
        joao.sacar(200.0);
        joao.sacar(2000.0);
        joao.exibirSaldo();
        contaBancaria guilherme = new contaBancaria("Guilherme Felberque", 10000);
        guilherme.exibirSaldo();
        guilherme.depositar(300.0);
        guilherme.sacar(3000);
        guilherme.exibirSaldo();
    }
}
