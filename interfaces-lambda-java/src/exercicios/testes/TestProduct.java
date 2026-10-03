package exercicios.testes;

import exercicios.exercicio2.*;

import java.util.List;

public class TestProduct {

    public static void main(String[] args) {

        Food food = new Food("Pizza", 45.99);
        Clothing clothing = new Clothing("T-Shirt", 29.99);
        Culture culture = new Culture("Mangas", 29.98);

        List<Product> products = List.of(
                new Food("Pizza", 45.99),
                new Health("Vitamina C", 32.50),
                new Clothing("T-Shirt", 29.99),
                new Culture("Mangas", 29.98)
        );

        products.forEach(p -> System.out.printf(
                "%-12s Preço: R$ %.2f | Imposto: R$ %.2f%n",
                p.getName(), p.getPrice(), p.calcularImposto()
        ));

        double total = products.stream()
                .mapToDouble(Taxable::calcularImposto)
                .sum();

        System.out.println(total);

    }

}
