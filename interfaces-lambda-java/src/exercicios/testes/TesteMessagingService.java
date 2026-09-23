package exercicios.testes;

import exercicios.EmailService;
import exercicios.MarketingCampaign;
import exercicios.MessagingService;
import exercicios.SmsService;
import exercicios.SocialMediaService;
import exercicios.WhatsAppService;

import java.util.List;

public class TesteMessagingService {

    public static void main(String[] args) {

        MessagingService sms = new SmsService();
        MessagingService email = new EmailService();
        MessagingService socialMedia = new SocialMediaService();
        MessagingService whatsApp = new WhatsAppService();

        List<MessagingService> services = List.of(sms, email, socialMedia, whatsApp);

        MarketingCampaign campaign = new MarketingCampaign(services);

        String mensagemPromo = "Aproveite! 50% de desconto em todo o site apenas hoje!";
        campaign.dispatch(mensagemPromo);

    }
}
