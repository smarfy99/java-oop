package Problem9_class;

public class Player {
	private String name;
	private double speed;
	private String[] tools;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void setTools(String[] tools) {
		if(tools == null) this.tools = null;
		else {
			this.tools = new String[tools.length];
			System.arraycopy(tools, 0, this.tools, 0, tools.length);
		}
	}
	
	String getName() {
		return name;
	}
	
	public void showDetails() {
		System.out.println("The name is " + name);
		if(speed == 0.0) System.out.println("There is no information about the speed of " + name);
		else System.out.println("The speed of " + name + " is " + speed + "km/h");
		if(tools == null) System.out.println(name + " does not have any tools");
		else {
			System.out.print(name + " have [ ");
			for(String tool: tools) {
				System.out.print(tool + " ");
			}
			System.out.println("]");
		}
	}
}
