package exercicios.exercicio2;

public class Health extends Product {
    public Health(String name, Double price) {
        super(name, price);
    }

    @Override
    public Double calcularImposto() {
        return getPrice() * 0.015;
    }
}
