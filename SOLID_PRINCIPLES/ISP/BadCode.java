package SOLID_PRINCIPLES.ISP;

// Bad Code: One giant interface that implements every method
interface MediaPlayer{
    void playAudio(String audioFlie);
    void stopAudio();
    void increaseVolume(int volume);

    void playVideo(String videoFile);
    void stopVideo();
    void adjustBrightness(int brightness);
    void showSubtitles(String subtitlesFile);
}

class AudioOnlyPlayer implements MediaPlayer{

    public void playAudio(String audioFile){

    }
    public void stopAudio(){

    }
    public void increaseVolume(int volume){

    }
    public void playVideo(String videoFile){    // they don't belong here, but we are force to write them

    }
    public void stopVideo(){    // they don't belong here, but we are forced to write them

    }
    public void adjustBrightness(int brightness){   // they don't belong here, but we are forced to write them

    }
    public void showSubtitles(String subtitlesFile){     // they don't belong here, but we are forced to write them


    }
}
public class BadCode {
    
}
