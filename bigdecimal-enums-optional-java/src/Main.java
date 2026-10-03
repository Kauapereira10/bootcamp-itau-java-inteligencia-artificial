import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        var value1 = new BigDecimal("56.32");
        var value2 = new BigDecimal("99.12");
        BigDecimal valor = new BigDecimal("2.345");

        System.out.println(valor.setScale(2, RoundingMode.HALF_UP));
        System.out.println(valor.setScale(2, RoundingMode.HALF_DOWN));
        System.out.println(valor.setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(valor.setScale(2, RoundingMode.UP));
        System.out.println(valor.setScale(2, RoundingMode.DOWN));

        System.out.println(new BigDecimal("2.355").setScale(2, RoundingMode.HALF_EVEN));

        BigDecimal um = BigDecimal.ONE;
        BigDecimal tres = new BigDecimal("3");

//        System.out.println(um.divide(3));
        System.out.println(um.divide(tres, 2, RoundingMode.HALF_UP));
        System.out.println(um.divide(tres, 4, RoundingMode.HALF_EVEN));

        BigDecimal preco = new BigDecimal("19.99");
        BigDecimal desconto = preco.multiply(new BigDecimal("0.15")).setScale(2, RoundingMode.HALF_UP);

        System.out.println("\nValor: " + preco);
        System.out.println("Desconto: " + desconto);
    }

}
