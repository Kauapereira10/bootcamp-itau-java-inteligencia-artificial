import java.time.*;
import java.time.format.DateTimeFormatter;

public class PraticasOffsetDateTimeAndOffsetTime {

    public static void main(String[] args) {

        System.out.println("=== OffsetDateTime ===");
        ZoneOffset brasil = ZoneOffset.of("-03:00");
        OffsetDateTime pagamento = OffsetDateTime.of(2026, 10, 4, 15, 0, 0, 0, brasil);
        System.out.println("Pagamento (Brasil): " + pagamento);

        OffsetDateTime emUtc = pagamento.withOffsetSameInstant(ZoneOffset.UTC);
        System.out.println("Mesmo instante em UTC: " + emUtc);

        System.out.println(pagamento.isEqual(emUtc));

        System.out.println("\n=== OffsetTime ===");
        OffsetTime reuniao = OffsetTime.of(LocalTime.of(9, 0), brasil);
        System.out.println("Reunião: " + reuniao);

        System.out.println("\n=== Parse ===");
        LocalDate lida = LocalDate.parse("2026-12-25");
        System.out.println("Natal: " + lida);

        DateTimeFormatter br = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate lidaBr = LocalDate.parse("25/12/2026", br);
        System.out.println("Natal (formato BR): " + lidaBr);

        OffsetDateTime api = OffsetDateTime.parse("2026-10-04T15:00:00-03:00");
        System.out.println("Vindo de uma API: " + api);
    }
}
