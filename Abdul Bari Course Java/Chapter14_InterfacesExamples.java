class Phone{
    void call(){
        System.out.println("Making a call");
    }
    void sms(){
        System.out.println("Sending an sms");
    }
}
interface Camera{
    void click();
    void record();
}
interface MusicPlayer{
    void play();
    void pause();
    void stop();
}


class SmartPhone extends Phone implements Camera,MusicPlayer{
    public void videoCall(){System.out.println("Calling through video");}
    public void click(){System.out.println("Photo is clicked");}
    public void record(){System.out.println("Video recording started");}
    public void play(){System.out.println("Music Playing");}
    public void pause(){System.out.println("Music Paused");}
    public void stop(){System.out.println("Music Stopped");}
}


public class Chapter14_InterfacesExamples {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.stop();
        s.record();
        Camera sp = new SmartPhone();
        sp.click();
    }
}
