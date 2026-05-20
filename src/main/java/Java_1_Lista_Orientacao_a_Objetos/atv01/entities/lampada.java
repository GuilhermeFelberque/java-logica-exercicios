package Java_1_Lista_Orientacao_a_Objetos.atv01.entities;

public class lampada {private boolean ligada;
    public void ligar() {
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public boolean isLigada(){
        return ligada;
    }
}