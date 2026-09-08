import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        doWhile();

        sc.close();
    }

    private static void doWhile(){
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU BANCO ITAÚ ---");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Fazer Depósito");
            System.out.println("3 - Fazer Transferência");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Seu saldo atual é R$ 1.500,00");
                case 2 -> System.out.println("Depósito realizado com sucesso!");
                case 3 -> System.out.println("Transferência realizada com sucesso!");
                case 0 -> System.out.println("Obrigado por usar nossos serviços. Até logo!");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }

            // O laço continua se a opção for DIFERENTE de 0
        } while (opcao != 0);

        sc.close();
    }

    private static void whileString(){
        Scanner sc = new Scanner(System.in);

        String name = "";
        while (!name.equals("exit")) {
            System.out.println("Informe um nome: ");
            name = sc.next();
            String[] names = new String[]{name};
            System.out.println(name);

        }
        sc.close();
    }

    private static void whileTrue(){
        Scanner sc = new Scanner(System.in);

        String name = "";
        while (true) {
            System.out.println("Informe um nome: ");
            name = sc.next();
            if (name.equalsIgnoreCase("exit")) break;
            System.out.println(name);

        }
        sc.close();
    }
}
