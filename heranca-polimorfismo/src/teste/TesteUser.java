package teste;

import exercicios.Attendant;
import exercicios.Manager;
import exercicios.Seller;

public class TesteUser {

    public static void main(String[] args) {
        Manager manager = new Manager("Ana", "ana@loja.com", "1234");
        Seller seller = new Seller("Bruno", "bruno@loja.com", "abcd");
        Attendant attendant = new Attendant("Carla", "carla@loja.com", "senha");

        System.out.println("Login gerente (correto): " + manager.takelogin("ana@loja.com", "1234"));
        System.out.println("Login vendedor (errado): " + seller.takelogin("bruno@loja.com", "xxxx"));

        seller.takingSales();
        seller.takingSales();
        System.out.println("\nVendas do Bruno: " + seller.consultSales());

        attendant.receivePayment(50.0);
        attendant.receivePayment(30.0);
        System.out.println("\nCaixa da Carla: R$ " + attendant.getCashValue());
        System.out.println("Fechamento: R$ " + attendant.closeBox());
        System.out.println("Caixa após fechar: R$ " + attendant.getCashValue());

        System.out.println();
        manager.generateFinancialReport();
        manager.consultSales();

        System.out.println("\nGerente é admin? " + manager.isAdmin());
        System.out.println("Vendedor é admin? " + seller.isAdmin());
        System.out.println("Atendente é admin? " + attendant.isAdmin());

        System.out.println("\nTrocou senha? " + seller.changePassword("abcd", "nova123"));
        seller.takingLogout();
    }

}
