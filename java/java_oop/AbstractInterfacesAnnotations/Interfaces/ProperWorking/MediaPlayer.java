package A_Theory.OOP.AbstractInterfacesAnnotations.Interfaces.ProperWorking;

public class MediaPlayer implements Media{
    @Override
    public void start(){
        System.out.println("Media Player starts");
    }

    @Override
    public void stop(){
        System.out.println("Media Player stops");
    }
}
