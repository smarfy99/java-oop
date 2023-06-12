package Field_Polymorphism;

public class CarExample {
    public static void main(String[] args) {
//        car객체 생성
        Car myCar = new Car();

//        Tire 객체 장착
        myCar.tire = new Tire();
        myCar.run();

//        한국타이어 장착
        myCar.tire = new HanKookTire();
        myCar.run();

//        금호타이어 장착
        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
