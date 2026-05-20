package Java_1_Lista_Orientacao_a_Objetos.atv06.entities;

public class aluno {
    public String nome;
    public int matricula;
    public double[] notas = new double[3];

    public aluno(String nome, int matricula, double n1, double n2, double n3){
        this.nome = nome;
        this.matricula = matricula;
        this.notas[0] = n1;
        this.notas[1] = n2;
        this.notas[2] = n3;
    }
    public double calculaMedia(){
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        return soma / notas.length;
    }
    public String verificaSituacao(){
        if (this.calculaMedia()>=7.0){
            return "Aprovado";
        }else {
            return "Reprovado";
        }
    }
}