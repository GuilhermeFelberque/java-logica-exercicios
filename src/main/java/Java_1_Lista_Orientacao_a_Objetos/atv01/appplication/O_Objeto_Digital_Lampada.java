package Java_1_Lista_Orientacao_a_Objetos.atv01.appplication;

import Java_1_Lista_Orientacao_a_Objetos.atv01.entities.lampada;

public class O_Objeto_Digital_Lampada {
    public static void main(String[] args) {
        lampada lampada = new lampada();
        lampada.ligar();
        if (lampada.isLigada()) {
            System.out.println("A lâmpada esta acessa");
        } else {
            System.out.println("A lâmpada esta desligada");
        }
        lampada.desligar();
        if (lampada.isLigada()){
            System.out.println("A lâmpada esta desligada");
        }else {
            System.out.println("A lâmpada esta desligada");
        }
    }
}
