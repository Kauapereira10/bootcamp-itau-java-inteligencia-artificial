package domain;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploLinkedAndTreeMap {

    public static void main(String[] args) {
        System.out.println("=== 1. LINKEDHASHMAP: PRESERVA A ORDEM DE INSERÇÃO ===");

        Map<String, User> linkedUsers = new LinkedHashMap<>();

        linkedUsers.put("zuleica@gmail.com", new User("Zuleica", 60));
        linkedUsers.put("ana@gmail.com", new User("Ana", 25));
        linkedUsers.put("carlos@gmail.com", new User("Carlos", 30));
        linkedUsers.put("bruno@gmail.com", new User("Bruno", 18));

        linkedUsers.forEach((email, user) -> System.out.println(" • " + email + " -> " + user.name()));

        System.out.println("\n=== 2. TREEMAP: ORDENAÇÃO NATURAL DAS CHAVES (ALFABÉTICA) ===");

        TreeMap<String, User> treeUsers = new TreeMap<>();

        treeUsers.putAll(linkedUsers); // Copia todos os dados do LinkedHashMap

        treeUsers.forEach((email, user) -> System.out.println("  • " + email + " -> " + user.name()));

        System.out.println("\n=== 3. MÉTODOS NAVEGÁVEIS EXCLUSIVOS DO TREEMAP ===");

        System.out.println("Primeira chave (menor): " + treeUsers.firstKey());
        System.out.println("Última chave (maior):  " + treeUsers.lastKey());

        System.out.println("Chave logo abaixo de 'carlos@gmail.com': " + treeUsers.lowerKey("carlos@gmail.com"));
        System.out.println("Chave logo acima de 'carlos@gmail.com':  " + treeUsers.higherKey("carlos@gmail.com"));

        System.out.println("\nSubMap (de 'b' até 'z'):");
        Map<String, User> subMap = treeUsers.subMap("bruno@gmail.com", "zuleica@gmail.com");
        subMap.forEach((email, user) -> System.out.println(" -> " + email));

        System.out.println("\n=== 4. TREEMAP COM COMPARATOR CUSTOMIZADO ===");

        Map<String, User> treeMapPorTamanhoEmail = new TreeMap<>(Comparator.comparing(String::length));

        treeMapPorTamanhoEmail.put("a@gmail.com", new User("A", 10));         // 11 chars
        treeMapPorTamanhoEmail.put("usuario.longo@gmail.com", new User("Longo", 30)); // 23 chars
        treeMapPorTamanhoEmail.put("medio@gmail.com", new User("Medio", 20));  // 15 chars
        treeMapPorTamanhoEmail.put("a", new User("So a letra", 1)); // 1 charsn

        treeMapPorTamanhoEmail.forEach((email, user) ->
                System.out.println(" [Tam: " + email.length() + "] " + email + " -> " + user.name())
        );

    }

}
