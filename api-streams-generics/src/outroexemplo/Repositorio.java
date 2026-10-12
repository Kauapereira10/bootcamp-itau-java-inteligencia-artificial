package outroexemplo;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Repositorio<T, ID> {
    private final Map<ID, T> banco = new LinkedHashMap<>();
    private final Function<T, ID> extratorId;

    public Repositorio(Function<T, ID> extratorId) {
        this.extratorId = extratorId;
    }

    public void salvar(T entidade) {
        banco.put(extratorId.apply(entidade), entidade);
    }

    public Optional<T> buscarPorID(ID id) {
        return Optional.ofNullable(banco.get(id));
    }

    public List<T> listarTodos() {
        return new ArrayList<>(banco.values());
    }

    public List<T> buscar(Predicate<? super T> filtro) {
        return banco.values().stream().filter(filtro).toList();
    }

}
