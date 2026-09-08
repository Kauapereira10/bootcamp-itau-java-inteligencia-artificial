package desafio;

import java.util.Scanner;

public class SetorBancario2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String codigoInformado = sc.nextLine();
        String codigoEsperado = sc.nextLine();

        if (codigoInformado.equals(codigoEsperado)) {
            System.out.println("ACESSO LIBERADO");
        }else {
            System.out.println("ACESSO NEGADO");
        }

        // Compare os dois textos exatamente como foram lidos.
        // Se forem identicos, exiba "ACESSO LIBERADO"; caso contrario, "ACESSO NEGADO".
        // TODO: imprima o resultado da validacao em uma unica linha.

        sc.close();
    }

}
