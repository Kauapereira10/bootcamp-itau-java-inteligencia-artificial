package set;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {
        Set<Integer> numeros = new TreeSet<>();

        numeros.add(50);
        numeros.add(10);
        numeros.add(40);
        numeros.add(30);
        numeros.add(20);

        numeros.forEach(System.out::println);
    }

}
