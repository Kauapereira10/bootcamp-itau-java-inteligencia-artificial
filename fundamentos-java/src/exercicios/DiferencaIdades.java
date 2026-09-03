package exercicios;

import java.util.Scanner;

public class DiferencaIdades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome(Pessoa 1): ");
        String nome1 = sc.next();

        System.out.println("Digite seu nome(Pessoa 2): ");
        String nome2 = sc.next();

        System.out.println("Digite sua idade " + nome1 + ": ");
        int idade1 = sc.nextInt();

        System.out.println("Digite sua idade " + nome2 + ": ");
        int idade2 = sc.nextInt();

        if(idade1 > idade2) {
            System.out.println(nome1 + " tem " + (idade1 - idade2) + " anos de diferença que o " + nome2 + ".");
        }else{
            System.out.println(nome2 + " tem " + (idade2 - idade1) + " anos de diferença que o " + nome1 + ".");
        }

        sc.close();
    }
}
