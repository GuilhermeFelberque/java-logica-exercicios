
package Java_1_Lista_Orientacao_a_Objetos.atv9.entities;

public class agenda {
    public contato [] contato = new contato[5];

   public void listarContatos (){
        for (int i=0; i < contato.length; i++) {
            if (contato [i] != null) {
                System.out.println(contato[i].nome);
            }
        }
    }
}