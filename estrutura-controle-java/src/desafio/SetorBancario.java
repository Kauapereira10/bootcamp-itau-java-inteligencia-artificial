package desafio;

import java.util.Scanner;

public class SetorBancario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String operacao = sc.nextLine();

        // A validacao deve ser exata, respeitando maiusculas e minusculas.
        // Compare a entrada com os tres codigos permitidos.
        boolean operacaoValida = false;

        if (operacao.equals("DEPOSITO") || operacao.equals("SAQUE") || operacao.equals("TRANSFERENCIA")){
            operacaoValida = true;
        }

        // TODO: atualize a variavel operacaoValida para true se a operacao for DEPOSITO, SAQUE ou TRANSFERENCIA.

        System.out.println(operacaoValida ? "VALID" : "INVALID");

        sc.close();
    }

}
