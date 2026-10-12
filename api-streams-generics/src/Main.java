import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> debugValues = new ArrayList<>();

        List<String> values = Stream.of("Maria", "Joao", "luana", "Thomas")
                .peek(debugValues::add)
                .toList();

        List<String> namesEndWithA = Stream.of("Maria", "Joao", "luana", "Thomas")
                .filter(name -> name.endsWith("a"))
                .toList();

        System.out.println(namesEndWithA);
        System.out.println(values);


        Optional<String> values2 = Stream.of("Maria", "Joao", "luana", "Thomas")
                .filter(n -> n.endsWith("o"))
                        .findAny();


        System.out.println(values2);

        var reduce = Stream.of("Maria", "Joao", "luana", "Thomas")
                .reduce("", (a, b) -> a + ";" + b)
                .toLowerCase();

        System.out.println(reduce);


        List<Integer> value = Stream.of(1, 2, 3, 4, 5, 6, 7, 6, 7)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(value);

        List<Boolean> value4 = Stream.of(1, 2, 3, 4, 5, 6, 7, 6, 7)
                .map(n -> n % 2 == 0)
                .toList();

        System.out.println(value4);

        List<Integer> values5 = List.of(3, 6, 9, 12);
        List<Integer> values6 = List.of(1,2,3,4,5,6,7,8,9,10,11,12);

    }

}
