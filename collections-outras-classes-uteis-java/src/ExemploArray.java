public class ExemploArray {

    public static void main(String[] args) {

        String[] contas = new String[3];

        contas[0] = "Conta Corrente";
        contas[1] = "Conta Poupança";
        contas[2] = "Conta Pagamento";

        System.out.println("Primeira conta: " + contas[0]);

        System.out.println("\n--- Lista de Contas (Array) ---");
        for (int i = 0; i < contas.length; i++) {
            System.out.println("índice " + i + ": " + contas[i]);
        }

    }
}
