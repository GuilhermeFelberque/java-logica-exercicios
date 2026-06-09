package Exercicio_Fixacao_Polimorfismo.applcation;

import Exercicio_Fixacao_Polimorfismo.entities.ImportedProduct;
import Exercicio_Fixacao_Polimorfismo.entities.Product;
import Exercicio_Fixacao_Polimorfismo.entities.UsedProduct;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Notebook", 2500.00));
        list.add(new Product( "Mouse", 150.00));
        list.add(new ImportedProduct( 200.00, "iPhone", 5000.00));
        list.add(new ImportedProduct(80.00, "Headphone", 300.00));
        list.add(new UsedProduct("Geladeira",800.00, LocalDate.of(2018, 5, 20)));

        System.out.println("Todos os Produtos");
        for (Product p : list) {
            System.out.println(p.priceTag());
        }

        // Busca por nome
        System.out.print("Digite o nome do produto que deseja buscar: ");
        String search = sc.nextLine();

        System.out.println("Resultado da Busca");
        boolean procurar = false;
        for (Product p : list) {
            if (p.getName().equalsIgnoreCase(search)) {
                System.out.println(p.priceTag());
                procurar = true;
            }
        }

        if (!procurar) {
            System.out.println("Produto não encontrado!");
        }

        sc.close();
        }
    }