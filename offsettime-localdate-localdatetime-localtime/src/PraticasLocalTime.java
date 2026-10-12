import java.time.LocalTime;

public class PraticasLocalTime {

    public static void main(String[] args) {

        System.out.println("=== LocalTime ===");
        LocalTime abertura = LocalTime.of(9, 0);
        LocalTime fechamento = LocalTime.of(18, 0);
        LocalTime agora = LocalTime.now();

        System.out.println("Abre: " + abertura + " | Fecha: " + fechamento);
        System.out.println("Depois do almoço (+1:30): " + LocalTime.of(12, 0).plusMinutes(90));

        boolean estaAberto = agora.isAfter(abertura) && agora.isBefore(fechamento);
        System.out.println("Loja aberta agora? " + estaAberto);
    }

}
