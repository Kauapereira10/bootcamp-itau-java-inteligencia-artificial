package exercicios;

import java.util.List;

public class MarketingCampaign {

    private final List<MessagingService> services;


    public MarketingCampaign(List<MessagingService> services) {
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
