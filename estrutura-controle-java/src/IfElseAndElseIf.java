import java.util.Scanner;

public class IfElseAndElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String name = sc.next();

        System.out.println("Informe sua idade: ");
        int age = sc.nextInt();

        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = sc.next().equalsIgnoreCase("s");

        if(age >= 18) {
            System.out.printf("%s você tem %s anos, você pode dirigir.", name, age);
        }else if(age >= 16 && isEmancipated){
            System.out.printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigir.\n", name, age);
        }else {
            System.out.printf("%s você tem %s anos, você não pode dirigir.\n", name, age);
        }

        System.out.println("====================================");

        System.out.println("Você tem cachorro? (sim/não)");
        String resultYesOrNo = sc.next();

        boolean isHaveDog = resultYesOrNo.equalsIgnoreCase("Sim");
        var result = isHaveDog ? "Sim, ele tem cachorro" : "Não, ele não tem cachorro.";

        System.out.println(result);

        sc.close();
    }
}
