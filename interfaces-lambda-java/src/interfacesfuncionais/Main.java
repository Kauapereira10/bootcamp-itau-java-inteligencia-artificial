package interfacesfuncionais;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Kaua", 20),
                new User("Thomas", 10),
                new User("Ana", 30));

        printStringValue(user -> user.name(), users);
        printIntValue(user -> user.age(), users);
    }

    private static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(user -> System.out.println(callback.apply(user)));
    }

    private static void printIntValue(Function<User, Integer> callback, List<User> users) {
        users.forEach(user -> System.out.println(callback.apply(user)));
    }
}
