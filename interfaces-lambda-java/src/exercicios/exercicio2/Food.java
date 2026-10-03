package exercicios.exercicio2;

public class Food extends Product {

    public Food(String name, Double price) {
        super(name, price);
    }

    @Override
    public Double calcularImposto() {
        return getPrice() * 0.01;
    }
}
