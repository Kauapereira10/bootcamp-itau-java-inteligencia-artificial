import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PraticasLocalDate {

    public static void main(String[] args) {

        System.out.println("=== LocalDate ===");
        LocalDate hoje = LocalDate.now();
        LocalDate nascimento = LocalDate.of(2006, 5, 1);

        System.out.println("Hoje: " + hoje);
        System.out.println("Nascimento: " + nascimento);

        int idade = Period.between(nascimento, hoje).getYears();
        System.out.println("Idade: " + idade + " anos");

        LocalDate devolucao = hoje.plusDays(7);
        System.out.println("Devolver o livro até: " + devolucao);

        long dias = ChronoUnit.DAYS.between(hoje, devolucao);
        System.out.println("Dias de empréstimo: " + dias);
        System.out.println("Ja venceu? " + devolucao.isBefore(hoje));

    }

}
