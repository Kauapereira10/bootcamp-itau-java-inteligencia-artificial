package exercicios;

import entidade.Account;

import java.util.Scanner;

public class TesteAccount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== BEM-VINDO AO BANCO DIOCLASS ===");
        System.out.print("Informe o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine(); // Limpa o buffer do scanner

        System.out.print("Informe o nome do titular: ");
        String nome = sc.nextLine();

        System.out.print("Informe o valor do depósito inicial: R$ ");
        double depositoInicial = sc.nextDouble();

        Account conta = new Account(numeroConta, nome, depositoInicial);

        int opcao;
        do {
            System.out.println("\n========== MENU BANCÁRIO ==========");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Sacar Dinheiro");
            System.out.println("5 - Pagar Boleto");
            System.out.println("6 - Verificar Uso do Cheque Especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    conta.consultarChequeEspecial();
                    break;
                case 3:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 4:
                    System.out.print("Digite o valor para sacar: R$ ");
                    double valorSaque = sc.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 5:
                    System.out.print("Digite o valor do boleto: R$ ");
                    double valorBoleto = sc.nextDouble();
                    conta.pagarBoleto(valorBoleto);
                    break;
                case 6:
                    if(conta.isUsandoChequeEspecial()) {
                        System.out.println(" Atenção: A conta ESTÁ utilizando o cheque especial!");
                    } else {
                        System.out.println(" A conta NÃO está utilizando o cheque especial.");
                    }
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar nosso sistema bancário. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        }while (opcao != 0);

        sc.close();
    }
}
