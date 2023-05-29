package Problem9;

public class BasketBallPlayer implements Player {
    private String name;
    private double speed;
    private String[] tools;
    private double jump;
    public BasketBallPlayer(String name) {
        this.name = name;
    }

    public void setJump(double jump) {
        this.jump = jump;
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
        System.out.println("점프: " + jump);
        System.out.println("기술: " + tools );
    }
}
