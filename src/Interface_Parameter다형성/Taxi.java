package Interface_Parameter다형성;

public class Taxi implements Vehicle{
    @Override
    public void run(){
        System.out.println("택시");
    }
}
