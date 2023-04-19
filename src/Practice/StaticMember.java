package Practice;

public class StaticMember {
    int speed;
    void run() {
        System.out.println(speed + "으로 달린다.");
    }
    static void simulate() {
        StaticMember myCar = new StaticMember();
        myCar.speed = 200;
        myCar.run();
    }

    public static void main(String[] args) {
//        정적 메소드 호출
        simulate();

        StaticMember myCar = new StaticMember();
        myCar.speed = 60;
        myCar.run();
    }
}
