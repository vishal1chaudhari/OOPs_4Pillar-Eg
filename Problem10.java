package Practice_4Pillars;
/*
 Write a program to simulate a media player. Create a superclass 'MediaPlayer' with a method 'play'.
 Create subclasses 'AudioPlayer' and 'VideoPlayer', each overriding the 'play' method.
 Demonstrate polymorphism by playing audio and video files.
 */

class MediaPlayer{
    void Play(){
        System.out.println("Media Player stores the Audio file and Video files");
    }
}

class AudioPlayer extends MediaPlayer{
    void Play(){    //overriden method
        System.out.println("Audio files play a Audio such as MP3");
    }
}

class VideoPlayer extends MediaPlayer{
    void Play(){        //overriden method
        System.out.println("Video files play a Video such as MP4");
    }
}

public class Problem10 {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.Play();
        System.out.println();
        VideoPlayer vp = new VideoPlayer();
        vp.Play();
    }
}
