package Java_1_Lista_Orientacao_a_Objetos.atv4.appplication;
import Java_1_Lista_Orientacao_a_Objetos.atv4.entities.Produto;
import java.util.Scanner;

public class Resumo {
public static void main(String[] args){
Produto p1 = new Produto("Mouse pad", 250,15);
Produto p2 = new Produto("Mouse gamer", 130,10);
p1.exibirResumo();
p2.exibirResumo();
    }
}