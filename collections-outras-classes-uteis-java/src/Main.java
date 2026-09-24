import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        var arrayStart = OffsetDateTime.now();
        for (int i = 0; i <= 100_000_000; i++) {
            arrayList.add(i);
        }
        System.out.println(Duration.between(OffsetDateTime.now(), arrayStart));

        var vectorStart = OffsetDateTime.now();
        List<Integer> vector = new Vector<>();
        for (int i = 0; i <= 100_000_000; i++) {
            vector.add(i);
        }

        System.out.println(Duration.between(OffsetDateTime.now(), vectorStart));

    }
}
