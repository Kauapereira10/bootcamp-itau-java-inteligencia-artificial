package exercicios;

import java.util.List;

public class Marketing {

    private final List<MessagingService> services;


    public Marketing(List<MessagingService> services) {
        this.services = services;
    }

    public void dispatch(String messege) {
        System.out.println("=== Iniciando Disparo da Campanha Marketing ===");
        for (MessagingService service : services) {
            service.sendMessage(messege);
        }
        System.out.println("==============================================");
    }
}
