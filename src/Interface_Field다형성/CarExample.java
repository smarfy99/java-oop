package Interface_Field다형성;

public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();

        myCar.run();

//        타이어 객체 교체
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        myCar.run();
    }
}
