package Java_1_Lista_Orientacao_a_Objetos.atv2.appplication;
import Java_1_Lista_Orientacao_a_Objetos.atv2.entities.Cachorro;
public class Registro_de_Pets {

    public static void main(String[] args){

        Cachorro dog1 = new Cachorro("Nebulosa", "canecorso", 3);
        Cachorro dog2 = new Cachorro("Thor", "Pastor Alemão", 5);

        dog1.latir();
        dog2.latir();
    }
}
