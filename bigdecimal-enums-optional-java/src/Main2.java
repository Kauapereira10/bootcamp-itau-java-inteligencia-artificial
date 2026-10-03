import enumeration.OperationEnum;

import java.util.Scanner;

public class Main2 {

    private static final int EXIT = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            for (OperationEnum op : OperationEnum.values()){
                System.out.println(op.getCode() + " - " + op.getLabel());
            }
            System.out.println(EXIT + " - Sair");

            int option = sc.nextInt();

            if (option == EXIT) {
                break;
            }

            var operation = OperationEnum.fromCode(option);
            if (operation.isEmpty()) {
                System.out.println("Opção inválida!");
                continue;
            }

            System.out.println("Informe o primeiro valor: ");
            int value1 = sc.nextInt();
            System.out.println("Informe o segundo valor: ");
            int value2 = sc.nextInt();

            try {
                int result = operation.get().execute(value1, value2);
                System.out.println("Resultado: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Erro: divisão por zero não é permitida.");
            }
        }

        sc.close();
    }

}
