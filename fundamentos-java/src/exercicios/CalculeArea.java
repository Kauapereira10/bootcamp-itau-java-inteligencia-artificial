package exercicios;

import java.util.Scanner;

public class CalculeArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Lado do quadrado: ");
        Double lado = sc.nextDouble();

        Double area = Math.pow(lado, 2);

        System.out.println(area);

        sc.close();
    }
}
