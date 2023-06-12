package Problem9_class;

public class BasketBallPlayer extends Player {
	double jump;
	
	BasketBallPlayer(String name) {
		super(name);
	}
	
	void setJump(double jump) {
		this.jump = jump;
	}
	
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println(getName() + " can jump with " + jump + "cm");
	}
}
