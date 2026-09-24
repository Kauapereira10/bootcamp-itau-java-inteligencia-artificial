import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOperacoes {

    public static void main(String[] args) {

        List<Double> saldos = new ArrayList<>();

        saldos.add(1500.50);
        saldos.add(250.00);
        saldos.add(4300.75);

        System.out.println("Saldos não ordenados: " + saldos);
        Collections.sort(saldos);
        System.out.println("Saldos ordenados: " + saldos);

        if (saldos.contains(250.00)) {
            System.out.println("Existe um saldo de R$ 250.00!");
        }

        System.out.println("\nSaldos maiores que R$ 1000.00:");
        saldos.stream()
                .filter(saldo -> saldo > 1000.00)
                .forEach(saldo -> System.out.println("R$ " + saldo));

    }

}
