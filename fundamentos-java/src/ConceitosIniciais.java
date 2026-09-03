import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ConceitosIniciais {

    private static final String WELCOME_MESSAGE = "Ola, informe seu nome: ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);
        String name = sc.next();
        System.out.println("Olá, " + name);

        System.out.println("Informe sua idade: ");
        int age = sc.nextInt();
        System.out.printf("%s tem %s de idade.", name, age);


        sc.close();
    }
}