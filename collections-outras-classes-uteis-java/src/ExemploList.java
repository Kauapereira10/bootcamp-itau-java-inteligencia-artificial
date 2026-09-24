import java.util.ArrayList;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        List<String> clientes = new ArrayList<>();

        clientes.add("Maria");
        clientes.add("João");
        clientes.add("Carlos");

        System.out.println("Total de clientes: " + clientes.size());
        System.out.println("Cliente no índice 1: " + clientes.get(1));

        clientes.remove("João");
//        clientes.remove(1);

        System.out.println("\n--- Clientes Restantes ---");
        for (String cliente : clientes) {
            System.out.println(cliente);
        }


    }

}
