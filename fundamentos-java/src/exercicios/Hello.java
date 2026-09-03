package exercicios;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String name = sc.next();

        System.out.println("Quantos anos você tem? ");
        int age = sc.nextInt();

        System.out.println("Olá, " + name + " você tem " + age + " anos.");

        sc.close();
    }
}
