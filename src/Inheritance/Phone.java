package Inheritance;

public class Phone {
//    필드 선언
    public String model;
    public String color;

//    기본생성자
    public Phone() {
        System.out.println("Phone() 생성자 실행");
    }

//    매개변수를 갖는 생성자 선언
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

//    메소드 선언
    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message) {
        System.out.println("나: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}
