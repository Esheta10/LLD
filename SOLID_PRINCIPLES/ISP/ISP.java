package SOLID_PRINCIPLES.ISP;

// Interface Segregation Principle -> Clients should not be forced to depend on methods they don't use.

interface AudioPlayerControls{

    void playAudio(String audioFile);
    void stopAudio();
    void adjustAudioVolume(int volume);
}

interface VideoPlayerControls{

    void playVideo(String videoFile);
    void stopVideo();
    void adjustBrightness(int brightness);
    void showSubtitles(String subtitles);
}

// Audio - only - player -> only implements audio player controls
class ModernAudioPlayer implements AudioPlayerControls{

    public void playAudio(String audioFile){
        System.out.println("Playing audio - " + audioFile);
    }

    public void stopAudio(){
        System.out.println("Stopping audio");
    }

    public void adjustAudioVolume(int volume){
        System.out.println("Volume - " + volume);
    }
    // no video methods at all, only audio methods -> clean code
}

// Video - only - player -> only implements video player Controls
class SilentVideoPlayer implements VideoPlayerControls{

    public void playVideo(String videoFile){
        System.out.println("Playing video - " + videoFile);
    }
    public void stopVideo(){
        System.out.println("Stopping video");
    }
    public void adjustBrightness(int brightness){
        System.out.println("Brightness - " + brightness);
    }
    public void showSubtitles(String subtitles){
        System.out.println("Subtitles - " + subtitles);
    }
}

// Full - featured  - player -> opts into both interfaces
class ComprehensiveMediaPlayer implements AudioPlayerControls, VideoPlayerControls{

    public void playAudio(String audioFile){
        System.out.println("Playing audio - " + audioFile);
    }

    public void stopAudio(){
        System.out.println("Stopping audio");
    }

    public void adjustAudioVolume(int volume){
        System.out.println("Volume - " + volume);
    }
      public void playVideo(String videoFile){
        System.out.println("Playing video - " + videoFile);
    }
    public void stopVideo(){
        System.out.println("Stopping video");
    }
    public void adjustBrightness(int brightness){
        System.out.println("Brightness - " + brightness);
    }
    public void showSubtitles(String subtitles){
        System.out.println("Subtitles - " + subtitles);
    }
}       

public class ISP {
    
    public static void main(String[] args) {
        

        // We cannot create object, but we create reference of an interface
        AudioPlayerControls audio = new ModernAudioPlayer();
        audio.playAudio("BillieJean.mp4");
        audio.adjustAudioVolume(70);
        audio.stopAudio();


        System.out.println("---------------------------");

        VideoPlayerControls video = new SilentVideoPlayer();
        video.playVideo("movie.mp4");
        video.adjustBrightness(40);
        video.showSubtitles("English");
        video.stopVideo();


        System.out.println("---------------------------");

        ComprehensiveMediaPlayer fullPlayer = new ComprehensiveMediaPlayer();
        fullPlayer.playAudio("BohemianRhapsody.mp4");
        fullPlayer.adjustAudioVolume(90);
        fullPlayer.stopAudio();
        fullPlayer.playVideo("full_movie.mp4");
        fullPlayer.adjustBrightness(80);
        fullPlayer.showSubtitles("English(Australia)");
        fullPlayer.stopVideo();


    }
}
