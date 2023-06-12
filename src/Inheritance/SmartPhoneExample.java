package Inheritance;

public class SmartPhoneExample {
    public static void main(String[] args) {
//        SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "검정색");

//        Phone으로부터 상속받은 필드 읽기
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);

//        SmartPhone의 필드 읽기
        System.out.println("와이파이 상태: " + myPhone.wifi);

//        Phone으로부터 상속받은 메서드 호출
        myPhone.bell();
        myPhone.sendVoice("여보세요.");
        myPhone.receiveVoice("안녕하세요! 저는 정지원입니다.");
        myPhone.sendVoice("반가워요.");
        myPhone.hangUp();

//        SmartPhone의 메소드 호출
        myPhone.setWifi(true);
        myPhone.internet();
    }
}
