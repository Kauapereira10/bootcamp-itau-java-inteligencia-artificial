package exercicios.testes;

import exercicios.Circle;
import exercicios.GeometricForm;
import exercicios.Rectangle;
import exercicios.Square;

import java.util.Scanner;

public class TesteGeometricForm {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int option = -1;
        do {
            System.out.println("\nEscolha a forma geométrica para calcular a área:");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - Sair do programa");

            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    GeometricForm square = createSquare();
                    System.out.println("Área do Quadrado: " + square.calcularArea());
                }
                case 2 -> {
                    GeometricForm rectangle = createRectangle();
                    System.out.println("Área do Retângulo: " + rectangle.calcularArea());
                }
                case 3 -> {
                    GeometricForm circle = createCircle();
                    System.out.println("Área do Círculo: " + circle.calcularArea());
                }
                case 4 -> System.out.println("Saindo do programa...");
                default -> System.out.println("Opção Inválida!");
            }

        } while (option != 4);
    }

    private static GeometricForm createSquare() {
        System.out.println("Informe os tamanho dos lados:");
        double side = sc.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRectangle() {
        System.out.println("Informe a base e a altura:");
        double height = sc.nextDouble();
        double base = sc.nextDouble();
        return new Rectangle(height, base);
    }

    private static GeometricForm createCircle() {
        System.out.println("Informe o Raio do circulo:");
        double radius = sc.nextDouble();
        return new Circle(radius);
    }
}
