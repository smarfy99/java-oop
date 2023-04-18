package Problem5;

public class Seat {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void show() {
//		js처럼 !name은 java에서는 안됨
		if (name == null) System.out.print("---");
		else {System.out.print(name);}
	}
	
	public boolean isMatched(String checkName) {
		if (name == null) return false;
		else {return name.equals(checkName);}
	}
	
	public void cancel() {
		name = null;
	}
	
	
}
