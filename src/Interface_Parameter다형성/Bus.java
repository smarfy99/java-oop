package Interface_Parameter다형성;

public class Bus implements Vehicle{
    @Override
    public void run(){
        System.out.println("버스");
    }
}
