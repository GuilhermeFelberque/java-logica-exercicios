package Java_1_Lista_Orientacao_a_Objetos.atv09.appplication;
import Java_1_Lista_Orientacao_a_Objetos.atv09.entities.agenda;
import Java_1_Lista_Orientacao_a_Objetos.atv09.entities.contato;
public class main {
    public static void main(String[] args) {
        agenda agenda1 = new agenda();
        agenda1.contato[0] = new contato("João", "99999-1111");
        agenda1.contato[1] = new contato("Maria", "99999-2222");
        agenda1.contato[2] = new contato("Carlos", "99999-3333");

        agenda1.listarContatos();
    }
}
