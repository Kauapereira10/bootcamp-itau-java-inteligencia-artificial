public class AtribuicaoAndLogica {

    public static void main(String[] args) {

        // OPERADORES DE ATRIBUIÇÃO

        int numero = 10;

        System.out.println("===== ATRIBUIÇÃO =====");
        System.out.println("Valor inicial: " + numero);

        numero += 5; // numero = numero + 5
        System.out.println("numero += 5: " + numero);

        numero -= 3; // numero = numero - 3
        System.out.println("numero -= 3: " + numero);

        numero *= 2; // numero = numero * 2
        System.out.println("numero *= 2: " + numero);

        numero /= 4; // numero = numero / 4
        System.out.println("numero /= 4: " + numero);

        numero %= 3; // numero = numero % 3
        System.out.println("numero %= 3: " + numero);

        // OPERADORES LÓGICOS

        int idade = 20;
        boolean possuiCarteira = true;

        System.out.println("\n===== OPERADORES LÓGICOS =====");

        boolean maiorDeIdade = idade >= 18;

        System.out.println("Maior de idade: " + maiorDeIdade);
        System.out.println("Possui carteira: " + possuiCarteira);

        // && = E
        System.out.println(
                "Pode dirigir? " + (maiorDeIdade && possuiCarteira)
        );

        // || = OU
        System.out.println(
                "Pode entrar na condição? " + (maiorDeIdade || possuiCarteira)
        );

        // ! = NÃO
        System.out.println(
                "Não possui carteira? " + (!possuiCarteira)
        );

    }

}
