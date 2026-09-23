package exercicios;

public class SmsService implements MessagingService{
    @Override
    public void sendMessage(String message) {
        System.out.println("[SMS] Enviando mensagem via SMS: " + message);
    }
}
