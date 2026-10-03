package exercicios;

public class Attendant extends User{

    private double cashValue;

    public Attendant(String name, String email, String password) {
        super(name, email, password, false);
        this.cashValue = 0.0;
    }

    public void receivePayment(double value) {
        if (value > 0) {
            this.cashValue += value;
        } else {
            throw new IllegalArgumentException("Valor tem que ser maior que ZERO!");
        }
    }

    public double closeBox() {
        double total = cashValue;
        cashValue = 0.0;
        return total;
    }

    public double getCashValue() {
        return cashValue;
    }

}
