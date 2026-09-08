package exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = sc.nextInt();

        while (num2 <= num1) {
            System.out.print("O  segundo número DEVE ser maior que o primeiro. Digite novamente: ");
            num2 = sc.nextInt();
        }

        System.out.println("\nEscolha o tipo de número a ser exibido:");
        System.out.println("1 - Par");
        System.out.println("2 - Ímpar");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        for (int i = num2; i >= num1; i--) {
            if(opcao == 1) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    }
                } else if (opcao == 2) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }else {
                    System.out.println("Opção inválida!");
                    break;
                }

            }

        sc.close();
        }
}
