package exercicios;

public record Rectangle(double height, double base) implements GeometricForm{

    @Override
    public double calcularArea() {
        return height * base;
    }
}
