package domain;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {
        // Inicialização do Map usando Email como chave única
        Map<String, User> users = new HashMap<>();

        System.out.println("--- 1. INSERÇÃO E ATUALIZAÇÃO BÁSICA ---");
        users.put("joao@gmail.com", new User("Joao", 16));
        users.put("kaua@gmail.com", new User("Kaua", 20));
        users.put("thomas@gmail.com", new User("Thomas", 7));
        users.put("lorraine@gmail.com", new User("Lorraine", 40));

        // Reimpressão usando forEach para formatação legível
        users.forEach((email, user) -> System.out.println("  • " + email + " -> " + user));

        System.out.println("\n--- 2. ITERAÇÃO POR CHAVES E VALORES ---");
        System.out.print("Todas as Chaves (Emails): ");
        System.out.println(users.keySet());

        System.out.println("Todos os Valores (Usuários):");
        users.values().forEach(user -> System.out.println("  - " + user));

        System.out.println("\n--- 3. BUSCAS E VERIFICAÇÕES ---");
        boolean temLorraine = users.containsKey("lorraine@gmail.com");
        System.out.println("Existe chave 'lorraine@gmail.com'? " + temLorraine);

        // ATENÇÃO: containsValue requer equals() e hashCode() implementados na classe User
        boolean temThomas = users.containsValue(new User("Thomas", 7));
        System.out.println("Existe valor idêntico a Thomas(7)? " + temThomas);

        System.out.println("\n--- 4. REMOÇÃO SEURA E CONDICIONAL ---");
        // Remove apenas se a chave E o valor baterem exatamente
        boolean removeuLorraine = users.remove("lorraine@gmail.com", new User("Lorraine", 40));
        System.out.println("Lorraine removida com validação de objeto? " + removeuLorraine);

        // Remoção simples apenas pela chave
        User usuarioRemovido = users.remove("joao@gmail.com");
        System.out.println("Usuário removido da chave 'joao@gmail.com': " + usuarioRemovido);

        System.out.println("\n--- 5. SUBSTITUIÇÃO E ATUALIZAÇÃO DE DADOS ---");
        // Atualiza a idade do Kauã
        users.replace("kaua@gmail.com", new User("Kaua", 21));
        System.out.println("Após replace no Kauã: " + users.get("kaua@gmail.com"));

        System.out.println("\n--- 6. MÉTODOS DEFENSIVOS E AVANÇADOS (Java 8+) ---");

        // getOrDefault: Evita retornar 'null' e previne NullPointerException
        User usuarioEncontrado = users.getOrDefault("kaua@gmail.com", new User("Desconhecido", 0));
        User usuarioInexistente = users.getOrDefault("semregistro@gmail.com", new User("Desconhecido", 0));
        System.out.println("Busca existente: " + usuarioEncontrado);
        System.out.println("Busca inexistente (fallback padrão): " + usuarioInexistente);

        // putIfAbsent: Só insere se a chave ainda NÃO existir no Map
        users.putIfAbsent("kaua@gmail.com", new User("Kaua Clone", 99)); // Ignorado
        users.putIfAbsent("novo@gmail.com", new User("Novo Usuario", 25)); // Inserido
        System.out.println("Após putIfAbsent ('novo@gmail.com'): " + users.get("novo@gmail.com"));

        // merge: Combina dados existentes com novos dados usando uma função lambda
        // Exemplo: Atualiza o objeto combinando/substituindo com o novo
        users.merge("kaua@gmail.com", new User("Kaua Silva", 22), (oldUser, newUser) -> {
            System.out.println("  [Merge trigger] Antigo: " + oldUser + " | Novo: " + newUser);
            return newUser; // Define qual objeto prevalece ou constrói um novo
        });

        System.out.println("\n--- ESTADO FINAL DO MAP ---");
        users.forEach((email, user) -> System.out.println("  " + email + " => " + user));
    }
}