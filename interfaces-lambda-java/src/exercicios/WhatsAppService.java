package exercicios;

public class WhatsAppService implements MessagingService{

    @Override
    public void sendMessage(String message) {
        System.out.println("[WHATSAPP] Enviando mensagem via WhatsApp: " + message);
    }

}
