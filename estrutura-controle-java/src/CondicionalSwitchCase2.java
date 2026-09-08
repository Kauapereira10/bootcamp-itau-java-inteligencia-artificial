import java.util.Scanner;

public class CondicionalSwitchCase2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número de 1 ate 7");
        var option = sc.nextInt();
        String feira = "-Feira";

        switch (option){
//            case 1, 2 -> System.out.println("Fim de semana.");
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda"+feira);
            case 3 -> System.out.println("Terça"+feira);
            case 4 -> System.out.println("Quarta"+feira);
            case 5 -> System.out.println("Quinta"+feira);
            case 6 -> System.out.println("Sexta"+feira);
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Opção Inválida.");
        }

        sc.close();
    }
}
