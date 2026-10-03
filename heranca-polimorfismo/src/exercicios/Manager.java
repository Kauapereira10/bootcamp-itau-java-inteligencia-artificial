package exercicios;

public class Manager extends User{

    public Manager(String name, String email, String password) {
        super(name, email, password, true);
    }

    public void generateFinancialReport() {
        System.out.println("Relatório financeiro gerado por " + getName() + ".");
    }

    public void consultSales() {
        System.out.println(getName() + " está consultando as vendas da loja.");
    }

}
