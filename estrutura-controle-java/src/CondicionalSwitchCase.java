import java.util.Scanner;

public class CondicionalSwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número de 1 ate 7");
        var option = sc.nextInt();
        String feira = "-Feira";

        switch (option) {
            case 1:
            case 7:
                System.out.println("Fim de semana uhuull \\o/");
                break;
            case 2:
                System.out.println("Segunda"+feira);
                break;
            case 3:
                System.out.println("Terça"+feira);
                break;
            case 4:
                System.out.println("Quarta"+feira);
                break;
            case 5:
                System.out.println("Quinta"+feira);
                break;
            case 6:
                System.out.println("Sexta"+feira);
                break;
            default:
                System.out.println("Opção Inválida.");

        }

        sc.close();
    }
}
