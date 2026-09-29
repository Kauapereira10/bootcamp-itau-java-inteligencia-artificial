package set;

import listArrays.User;

import java.util.HashSet;
import java.util.Set;

public class TesteUser {

    public static void main(String[] args) {
        User user1 = new User(10, "Carlos");
        User user2 = new User(10, "Carlos");

        System.out.println("O usuario 1 e igual ao usuario 2 ? " + user1.equals(user2));
        System.out.println("HshCode: " + user1.hashCode());
        System.out.println("HshCode: " + user2.hashCode());

        System.out.println("====== COM SET ======");

        Set<User> users = new HashSet<>();

        User user3 = new User(1, "Joao");
        User user4 = new User(1, "Joao");

        users.add(user3);
        users.add(user4);

        System.out.println(users.size());


    }

}
