package exercicios;

public class Seller extends User{
    private int quantitySales;

    public Seller(String name, String email, String password) {
        super(name, email, password, false);
        this.quantitySales = 0;
    }

    public void takingSales() {
        this.quantitySales += 1;
    }

    public int consultSales(){
        return this.quantitySales;
    }

    public int getQuantitySales() {
        return quantitySales;
    }
}
