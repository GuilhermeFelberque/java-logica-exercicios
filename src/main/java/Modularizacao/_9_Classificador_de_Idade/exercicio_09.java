package Modularizacao._9_Classificador_de_Idade;

public class exercicio_09 {
    int idade;
    public static String classificar(int idade) {
        if (idade < 0) {
            return "Idade inválida!";
        } else if (idade <= 12) {
            return "Infantil";
        } else if (idade <= 17) {
            return "Adolescente";
        } else if (idade <= 59) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }
}
