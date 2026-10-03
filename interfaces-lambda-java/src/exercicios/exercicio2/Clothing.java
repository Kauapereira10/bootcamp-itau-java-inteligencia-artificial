package exercicios.exercicio2;

public class Clothing extends Product {
    public Clothing(String name, Double price) {
        super(name, price);
    }

    @Override
    public Double calcularImposto() {
        return getPrice() * 0.025;
    }
}
