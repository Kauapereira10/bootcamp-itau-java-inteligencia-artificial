import enums.ContactType;
import enums.Sex;
import records.Contact;
import records.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ApiStream {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>(generateUsers());

        var values = users.stream()
                .flatMap(u -> u.contacts().stream())
                .filter(c -> c.type() == ContactType.PHONE)
                .map(c -> c.description()
                        .replace("(", "")
                        .replace(")", "")
                        .replace("-", ""));

        var values2 = users.stream()
                .filter(u -> u.sex() == Sex.FEMALE)
                .limit(1)
                        .collect(Collectors.toMap(User::name, user -> user));

        System.out.println(values2);
    }

    private static List<User> generateUsers() {

        var contacts1 = List.of(
                new Contact("kaua@gmail.com", ContactType.EMAIL),
                new Contact("(11) 99999-1111", ContactType.PHONE)
        );

        var contacts2 = List.of(
                new Contact("joao@gmail.com", ContactType.EMAIL)
        );

        var contacts3 = List.of(
                new Contact("(11) 96666-4444", ContactType.PHONE)
        );

        var contacts4 = List.of(
                new Contact("ana@gmail.com", ContactType.EMAIL),
                new Contact("(11) 95555-5555", ContactType.PHONE)
        );

        var contacts5 = List.of(
                new Contact("pedro@gmail.com", ContactType.EMAIL),
                new Contact("(11) 94444-6666", ContactType.PHONE)
        );

        var user1 = new User("Kaua", 20, Sex.MALE, new ArrayList<>(contacts1));

        var user2 = new User("Joao", 25, Sex.MALE, new ArrayList<>(contacts2));

        var user3 = new User("Maria", 22, Sex.FEMALE, new ArrayList<>(contacts3));

        var user4 = new User("Ana", 30, Sex.FEMALE, new ArrayList<>(contacts4));

        var user5 = new User("Pedro", 28, Sex.MALE, new ArrayList<>(contacts5));

        return List.of(user1, user2, user3, user4, user5);
    }
}