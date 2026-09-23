package interfacesnormal;

public class SmartPhone implements VideoPlayer, MusicPlayer{
    @Override
    public void playVideo() {
        System.out.println("O smartphone está tocando música.");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O smartphone está pausando música.");
    }

    @Override
    public void stopVideo() {
        System.out.println("O smartphone está parando a música");
    }

    @Override
    public void playMusic() {
        System.out.println("O smartphone está reproduzinho o video.");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smartphone está sendo pausado o video.");
    }

    @Override
    public void stopMusic() {
        System.out.println("O smartphone está parando o video.");
    }
}
