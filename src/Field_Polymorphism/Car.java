package Field_Polymorphism;

public class Car {
//    필드 선언
    public Tire tire;

//    메서드 선언
    public void run() {
//        tire필드에 대입된 객체의 roll() 메서드 호출
        tire.roll();
    }
}
