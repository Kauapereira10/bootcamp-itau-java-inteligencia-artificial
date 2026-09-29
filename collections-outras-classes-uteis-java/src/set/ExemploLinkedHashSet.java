package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {
        Set<String> nomes = new LinkedHashSet<>();

        nomes.add("Joao");
        nomes.add("Kaua");
        nomes.add("Maria");
        nomes.add("Ana");

        nomes.forEach(System.out::println);

        System.out.println("==== NUMEROS ====");

        Set<Integer> numeros = new LinkedHashSet<>();

        numeros.add(2);
        numeros.add(1);
        numeros.add(3);
        numeros.add(6);
        numeros.add(5);
        numeros.add(4);

        numeros.forEach(System.out::println);

    }

}
