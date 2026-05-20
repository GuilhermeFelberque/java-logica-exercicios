package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class fucao_para_String {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG";

        String s01 = original.toLowerCase(); //Todos os carcteres em caixa baixa
        String s02 = original.toUpperCase(); //Todos os carcteres em caixa alta
        String s03 = original.trim(); //Elimina os espaços
        String s04 = original.substring(2); //Irá gerar um nova string apartir do caracter c
        String s05 = original.substring(2, 9); //Irá gerar um nova string apartir do caracter c até o caracter H
        String s06 = original.replace('a', 'x'); //Irá trocar os carcteres 'a' por 'x'
        String s07 = original.replace("abc", "xy"); //Irá trocar os carcteres "abc" por "xy"
        int i = original.indexOf("bc"); //Capta o número da posição do primeiro caracter igual ao passado
        int j = original.lastIndexOf("bc"); //pta o número da posição do ultimo caracter igual ao passado

        System.out.println("Original: " + original + " - ");
        System.out.println("toLowerCase: - " + s01 + " - ");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
    }
}
