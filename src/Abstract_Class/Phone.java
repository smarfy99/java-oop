package Abstract_Class;

public abstract class Phone {
    String owner;

//    생성자 선언
    Phone(String owner){
        this.owner = owner;
    }

//    메소드 선언
    void turnOn() {
        System.out.println("폰전원 켬");
    }
    void turnOff() {
        System.out.println("폰전원 끔");
    }
}
