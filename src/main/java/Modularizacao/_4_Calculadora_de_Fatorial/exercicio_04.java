package Modularizacao._4_Calculadora_de_Fatorial;

public class exercicio_04 {
    public class CalculadoraFatorial {
        public int numero;

        public long calcular() {
            long fatorial = 1;
            int i = numero;

            while (i > 1) {
                fatorial *= i;
                i--;
            }

            return fatorial;
        }
    }
}
