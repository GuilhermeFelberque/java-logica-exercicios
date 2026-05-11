package Java_1_Lista_Orientacao_a_Objetos.atv06.appplication;
import Java_1_Lista_Orientacao_a_Objetos.atv06.entities.aluno;
public class nota {
    public static void main(String[] args){
        aluno aluno1 = new aluno("Fabio",209,8.1,3.5,1);
        System.out.println("Média: " + aluno1.calculaMedia());
        System.out.println("Situação: " + aluno1.verificaSituacao());
        aluno aluno2 = new aluno("Guilheme",110,10,8.1,7.6);
        System.out.println("Média: " + aluno2.calculaMedia());
        System.out.println("Situação: " + aluno2.verificaSituacao());
    }
}
