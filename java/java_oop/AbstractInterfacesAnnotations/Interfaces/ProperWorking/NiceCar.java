package java.java_oop.AbstractInterfacesAnnotations.Interfaces.ProperWorking;

public class NiceCar {
    private Engine engine;
    private Media media;

    public NiceCar(){
        this.engine = new PowerEngine();
        this.media = new MediaPlayer();
    }

    public NiceCar(Engine engine, Media media){
        this.engine = engine;
        this.media = media;
    }

    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }

    public void engineStart(){
        engine.start();
    }

    public void engineStop(){
        engine.stop();
    }

    public void mediaStart(){
        media.start();
    }

    public void mediaStop(){
        media.stop();
    }
}
