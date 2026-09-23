package exercicios;

public record Square(double side) implements GeometricForm{

    @Override
    public double calcularArea() {
        return side * side;
    }
}
