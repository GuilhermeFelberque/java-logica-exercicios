package Sistema_De_Compra_Online_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.application;

import Sistema_De_Compra_Online_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities.Compra;

public class Main {
    public static void main(String[] args) {
        Compra compra = new Compra();

        compra.adicionarProdutos();
        compra.dadosCliente();
        compra.calcularFrete();
        compra.finalizarCompra();
    }
}

