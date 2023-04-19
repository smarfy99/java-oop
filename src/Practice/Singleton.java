package Practice;

public class Singleton {
//    private 정적 필드
    private static Singleton singleton = new Singleton();

//    private constructor
    private Singleton() {}

//    public 정적 메서드
    public static Singleton getInstance() {
        return singleton;
    }
}
