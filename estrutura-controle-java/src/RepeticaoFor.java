import java.util.Scanner;

public class RepeticaoFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        forImpar();

        sc.close();
    }

    private static void forImpar() {
        for (var i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    private static void forPar() {
        for (var i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void forUmAteCem() {
        for (var i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    private static void forDoisEmDoisAteCinquenta() {
        for (var i = 2; i <= 50; i+=2) {
            System.out.println(i);
        }
    }

    private static void forUmAteCemBreak() {
        for (var i = 1; i <= 100; i++) {
            if (i == 50) break;
            System.out.println(i);
        }
    }

    private static void forBreak() {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.println("Digite um nome: ");
            String name = sc.next();
            if (name.equalsIgnoreCase("Exit")) break;

            System.out.println(name);
        }
        sc.close();
    }
}
