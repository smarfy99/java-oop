package Overriding1;

public class Computer extends Calculator {
//    메서드 오버라이딩
    @Override
    public double areaCircle(double r) {
        System.out.println("Computer객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
