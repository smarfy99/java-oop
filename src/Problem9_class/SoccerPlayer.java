package Problem9_class;

public class SoccerPlayer extends Player {
	double kickSpeed;
	
	SoccerPlayer(String name, double kickSpeed) {
		super(name);
		this.kickSpeed = kickSpeed;
	}
	
	void setKickSpeed(double kickSpeed) {
		this.kickSpeed = kickSpeed;
	}
	
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println(getName() + " has the kick of speed " + kickSpeed + "km/h");
	}
}
