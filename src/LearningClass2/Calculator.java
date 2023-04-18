//package LearningClass2;
//
//public class Calculator {
////    final은 초기화가 한번 되면 바꿀 수 없도록 함.
////    초기화하는 방법 1. String color = "black"
////    초기화하는 방법 2. constructor에서 this.color = color 로 정의, 초기화
//    final String color; //인스턴스 필드
////    객체와 관계없이 변하지 않는 값 : 상수
//    static final double PI; //정적 필드 //초기화하는 방법$1
//    static double inverse_pi;
//
//    static {
////        상수는 대문자로 정의하는 게 국룰
//        PI = 3.14; //초기화하는 방법$2 static 필드에서 정의
//        inverse_pi = 1/PI;
//    }
//
//    Calculator(String color) {
//        this.color = color;
//    }
//
//    void setColor(String color) { //인스턴스 메서드
//        this.color = color;
//    } //인스턴스 메서드
//
//    static int plus(int x, int y) { //정적 메서드
//        Calculator cal = new Calculator("Black");
//        cal.color = "white";
//        return x+y;
//    }// 정적 메서드 -> 인스턴스 멤버를 포함할 수 없음
//}
