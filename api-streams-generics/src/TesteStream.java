import records.Produto;

import java.util.*;

public class TesteStream {

    public static void main(String[] args) {

        List<Produto> produtos = List.of(
                new Produto("Notebook", "Eletrônicos", 3500.00, 10),
                new Produto("Mouse", "Eletrônicos", 80.00, 0),
                new Produto("Cadeira", "Móveis", 700.00, 5),
                new Produto("Mesa", "Móveis", 1200.00, 3),
                new Produto("Caneta", "Papelaria", 3.50, 200)
        );

        List<Produto> filter = produtos.stream()
                .filter(p -> p.estoque() > 0)
                .toList();
        System.out.println(filter);

        List<String> map = produtos.stream()
                .map(Produto::nome)
                .toList();
        System.out.println(map);

        List<String> encadear = produtos.stream()
                .filter(p -> p.estoque() > 0 && p.preco() > 500)
                .map(Produto::nome)
                .sorted()
                .toList();
        System.out.println(encadear);

        List<Produto> ordenarPorCriterio = produtos.stream()
                .sorted(Comparator.comparingDouble(Produto::preco).reversed())
                .limit(3)
                .toList();
        System.out.println(ordenarPorCriterio);

        double valorTotalEstoque = produtos.stream()
                .mapToDouble(p -> p.preco() * p.estoque())
                .sum();
        System.out.println(valorTotalEstoque);

        double media = produtos.stream()
                .mapToDouble(Produto::preco)
                .average()
                .orElse(0);
        System.out.println(media);

        DoubleSummaryStatistics statistics = produtos.stream()
                .mapToDouble(Produto::preco)
                .summaryStatistics();

        System.out.println(statistics);

        Optional<Produto> maisBarato = produtos.stream()
                .min(Comparator.comparingDouble(Produto::preco));
        System.out.println(maisBarato);

    }


}
