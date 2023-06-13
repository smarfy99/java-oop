package Abstract_Class;

public class PhoneExample {
    public static void main(String[] args){
        SmartPhone smartPhone = new SmartPhone("정지원");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
