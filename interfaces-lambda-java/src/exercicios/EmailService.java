package exercicios;

public class EmailService implements MessagingService{
    @Override
    public void sendMessage(String message) {
        System.out.println("[E-MAIL] Enviando mensagem via E-mail: " + message);
    }
}
