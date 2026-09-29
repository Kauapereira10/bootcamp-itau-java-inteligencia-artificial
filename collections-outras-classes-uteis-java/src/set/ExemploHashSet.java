package set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {
        Set<String> emailsCadastrados = new HashSet<>();

        emailsCadastrados.add("ana@email.com");
        emailsCadastrados.add("bob@email.com");
        emailsCadastrados.add("ana@email.com");

        emailsCadastrados.forEach(System.out::println);
        System.out.println("Total de e-mail: " + emailsCadastrados.size());
        System.out.println("E-mails: " + emailsCadastrados);

        if (emailsCadastrados.contains("bob@email.com"))
            System.out.println("E-mail já está em uso!");

    }
}
