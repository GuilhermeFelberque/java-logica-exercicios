package Java_1_Lista_Orientacao_a_Objetos.atv08.entities;

public class funcionario {
    public String nomeFuncionario;
    public String nomeSobrenome;
    public double salarioMensal;

    public funcionario(String nomeFuncionario, String nomeSobrenome, double salarioMensal){
        this.nomeFuncionario = nomeFuncionario;
        this.nomeSobrenome = nomeSobrenome;
        this.salarioMensal = salarioMensal;
    }
    public void darAumento(double porcentagem){
        salarioMensal += salarioMensal * porcentagem / 100;
        System.out.println("Novo salário " + salarioMensal);
    }
    public double salarioAnual(){
         return salarioMensal * 12;
    }
}
