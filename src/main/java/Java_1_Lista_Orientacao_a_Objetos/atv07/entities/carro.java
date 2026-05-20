package Java_1_Lista_Orientacao_a_Objetos.atv07.entities;

public class carro {
    public String modelo;
    public String marca;
    public int velocidadeAtual = 0;

    public carro(String modelo, String marca, int velocidadeAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
    }
    public void acelerar(){
        velocidadeAtual += 10;
        System.out.println("Velocidade atual: " + velocidadeAtual + "Km/h");
    }
    public void frear(){
        velocidadeAtual -=10;
        if (velocidadeAtual <0){
            velocidadeAtual = 0;
        }
        System.out.println("Velocidade atual: " + velocidadeAtual + "Km/h");
    }
}
