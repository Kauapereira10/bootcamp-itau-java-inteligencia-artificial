import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PraticasLocalDateTime {

    public static void main(String[] args) {

        System.out.println("=== LocalDateTime ===");
        LocalDateTime consulta = LocalDateTime.of(2026, 10, 10, 14, 30);
        System.out.println("Consulta: " + consulta);
        System.out.println("Remarcada (+2 dias): " + consulta.plusDays(2));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Formatada: " + consulta.format(formatter));

        System.out.println("Só a data: " + consulta.toLocalDate());
        System.out.println("Só a hora: " + consulta.toLocalTime());
    }
}
