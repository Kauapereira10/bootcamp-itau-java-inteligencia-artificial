package outroexemplo;

import com.sun.security.jgss.GSSUtil;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Repositorio<Produto, Long> repo = new Repositorio<>(Produto::id);
        repo.salvar(new Produto(1L, "Notebook", "Eletrônicos", 3500.00, 10));
        repo.salvar(new Produto(2L, "Mouse", "Eletrônicos", 80.00, 0));
        repo.salvar(new Produto(3L, "Cadeira", "Móveis", 700.00, 5));
        repo.salvar(new Produto(4L, "Mesa", "Móveis", 1200.00, 3));
        repo.salvar(new Produto(5L, "Caneta", "Papelaria", 3.50, 200));

        List<Produto> produtoLists = repo.listarTodos();

        System.out.println("Streams: filter + map + sorted (caros e disponíveis)");
        List<String> carosDisponiveis = produtoLists.stream()
                .filter(p -> p.preco() > 500 && p.estoque() > 0)
                .map(Produto::nome)
                .sorted()
                .toList();
        System.out.println(carosDisponiveis);

        System.out.println("\nStreams: os 2 mais caros (sorted + limit)");
        List<Produto> doisMaisCaros = produtoLists.stream()
                .sorted(Comparator.comparingDouble(Produto::preco).reversed())
                .limit(2)
                .toList();
        System.out.println(doisMaisCaros);

    }
}
