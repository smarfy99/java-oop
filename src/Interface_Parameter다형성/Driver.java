package Interface_Parameter다형성;

public class Driver {
    void drive(Vehicle vehicle){
//      구현 객체가 대입될 수 있도록 매개변수를 인터페이스 타입으로 선언
        vehicle.run();
//      인터페이스 메서드 호출
    }
}
