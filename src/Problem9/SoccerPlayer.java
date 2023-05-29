package Problem9;

public class SoccerPlayer implements Player {
    private String name;
    private double speed;
    private String[] tools;
    private double kickSpeed;
    public SoccerPlayer(String name, double kickSpeed) {
        this.name = name;
        this.kickSpeed = kickSpeed;
    }

    public void setKickSpeed(double kickSpeed) {
        this.kickSpeed = kickSpeed;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void setTools(String[] tools) {
        this.tools = tools;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void showDetails() {
        System.out.println("이름: " + name);
        System.out.println("속도: " + speed);
        System.out.println("킥 속도: " + kickSpeed);
        System.out.println("기술: " + tools);
    }
}
