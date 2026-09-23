package exercicios;

public class SocialMediaService implements MessagingService{
    @Override
    public void sendMessage(String message) {
        System.out.println("[REDES SOCIAIS] Publicando nas redes sociais: " + message);
    }
}
