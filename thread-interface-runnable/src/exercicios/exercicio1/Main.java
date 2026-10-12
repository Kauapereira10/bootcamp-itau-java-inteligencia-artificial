package exercicios.exercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero da operação desejada a realizar(1 = Sum ou 2 = Subtractio)");
        var operationOption = sc.nextInt();

        while (operationOption > 2 || operationOption < 1){
            System.out.println("Escolha uma opção válida(1 = Sum ou 2 = Subtractio)");
            operationOption = sc.nextInt();
        }

        var selectedOperation = Operation.values()[operationOption -1];
        System.out.println("Informe os numeros que serao usados separados por virgula (ex: 1,2,3,4):");
        var numbers = sc.next();
        var numberArray = Arrays.stream(numbers.split(",")).mapToLong(Long::parseLong).toArray();
        var result = selectedOperation.getOperationCallBack().exec(numberArray);

        System.out.println("O rerultado da Operacao: " + result);


        sc.close();
    }

}
