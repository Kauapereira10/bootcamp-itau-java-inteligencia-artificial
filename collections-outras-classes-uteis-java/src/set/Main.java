package set;

import listArrays.User;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<User> users = new HashSet<>();
        users.add(new User(1, "Joao"));
        users.add(new User(2, "Kaua"));
        users.add(new User(3, "Tiago"));
        users.add(new User(4, "Maria"));
        users.add(new User(5, "Ana"));
        users.add(new User(6, "Jussara"));

        System.out.println(users.toString());
        System.out.println(new User(6, "Damon").hashCode());
        users.forEach(System.out::println);
        System.out.println(users.contains(new User(2, "Kau")));

        users.removeIf(user -> user.getCode() > 5);
        users.forEach(System.out::println);


    }

}
