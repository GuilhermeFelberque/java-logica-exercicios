package Java_1_Lista_Orientacao_a_Objetos.atv02.entities;

public class Cachorro {

        public String nome;
        public String raca;
        public int idade;

        public Cachorro(String nome, String raca, int idade){
            this.nome = nome;
            this.raca = raca;
            this.idade = idade;
        }

        public void latir() {
            System.out.println("O/A " + nome + " de raça " + raca + " está latindo: AU AU!" + " e tem" + idade + " ano/s");
        }
    }

