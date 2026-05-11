package Modularizacao._3_Contador_de_Palavras;

public class exercicio_03 {
    public static int contar(String frase) {
        String[] palavras = frase.trim().split(" ");
        int contador = 0;
        int i = 0;
        while (i < palavras.length) {
            for (int j = 0; j < 1; j++) {
                contador++;
            }
            i++;
        }
        return contador;
    }
}


