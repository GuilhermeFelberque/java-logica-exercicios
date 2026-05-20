package Java_1_Lista_Orientacao_a_Objetos.atv08.appplication;
import Java_1_Lista_Orientacao_a_Objetos.atv08.entities.funcionario;
public class main {
    public static void main(String[] args){
        funcionario f1 = new funcionario("Danilo", "Dorella", 2000);
        f1.darAumento(10);
        System.out.println("Novo salario anual R$: " + f1.salarioAnual());
    }
}
