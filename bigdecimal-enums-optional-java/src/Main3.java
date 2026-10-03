import entity.User;
import entity.UserV2;

import java.util.Optional;

import static enumeration.SexEnum.FEMALE;
import static enumeration.SexEnum.MALE;

public class Main3 {

    public static void main(String[] args) {
        Optional<User> optionalUser =  Optional.of(new User("Kaua", 20, MALE));
        Optional<User> optionalUser2 =  Optional.empty();

        System.out.println(optionalUser.orElse(defaultUser()));
        System.out.println(optionalUser.orElseGet(Main3::defaultUser));

        var newUser = optionalUser.map(user -> new UserV2(user.name(), user.age(), user.sex())).orElseThrow();
        System.out.println(newUser);
    }

    public static User defaultUser() {
        System.out.println("Buscando valor Default....");
        return new User("Maria", 22, FEMALE);
    }

}
