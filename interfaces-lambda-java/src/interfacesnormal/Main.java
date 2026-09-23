package interfacesnormal;

public class Main {

    public static void main(String[] args) {

        MusicPlayer musicPlayer = new MusicBox();
        MusicPlayer videoPlayer1 = new SmartPhone();
        VideoPlayer videoPlayer2 = new SmartPhone();

        runMusic(musicPlayer);
        runVideo((VideoPlayer) videoPlayer1);
        runVideo(videoPlayer2);

    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }
}
