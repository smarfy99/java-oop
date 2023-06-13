package Interface;

public class Television implements RemoteControl{
    @Override
    public void turnOn(){
        System.out.println("TV켭니다.");
    }
}
