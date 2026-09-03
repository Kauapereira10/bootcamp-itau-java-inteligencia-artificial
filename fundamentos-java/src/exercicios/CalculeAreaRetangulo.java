package exercicios;

import java.util.Scanner;

public class CalculeAreaRetangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base do retangulo: ");
        Double base = sc.nextDouble();

        System.out.println("Digite a altura de um retângulo: ");
        Double altura = sc.nextDouble();

        Double area = base * altura;

        System.out.println(area);

        sc.close();
    }
}
