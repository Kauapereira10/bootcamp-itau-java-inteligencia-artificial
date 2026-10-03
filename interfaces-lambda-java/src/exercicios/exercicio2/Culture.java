package exercicios.exercicio2;

public class Culture extends Product {
    public Culture(String name, Double price) {
        super(name, price);
    }

    @Override
    public Double calcularImposto() {
        return getPrice() * 0.04;
    }
}
