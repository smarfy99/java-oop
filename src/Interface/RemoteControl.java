package Interface;

public interface RemoteControl {
//    상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

//    public 추상메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

//    디폴트 인스턴스 메서드
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리");
//            추상 메서드 호출하면서 상수필드사용
            setVolume(MIN_VOLUME);
        }else{
            System.out.println("무음 해제");
        }
    }

//    정적 메서드
    static void changeBattery(){
        System.out.println("리모콘 건전지 교환");
    }
}
