package interfacesnormal;

public class MusicBox implements MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("O interfacesnormal.MusicBox está reproduzinho a música.");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O interfacesnormal.MusicBox está sendo pausado o música.");
    }

    @Override
    public void stopMusic() {
        System.out.println("O interfacesnormal.MusicBox está parando o música.");
    }
}
