package outroexemplo;

import java.util.List;

public class ProdutoService {

    private final Repositorio<Produto, Long> repositorio;

    public ProdutoService(Repositorio<Produto, Long> repositorio) {
        this.repositorio = repositorio;
    }

    ApiResponse<Produto> buscar(Long id) {
        return repositorio.buscarPorID(id)
                .map(ApiResponse::ok)
                .orElseGet(() -> ApiResponse.erro("Produto " + id + " não encontrado"));
    }

    ApiResponse<List<String>> nomesDisponiveis() {
        List<String> nomes = repositorio.buscar(p -> p.preco() > 0)
                .stream()
                .map(Produto::nome)
                .sorted()
                .toList();

        return ApiResponse.ok(nomes);
    }


}
