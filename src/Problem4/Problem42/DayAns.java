package Problem4.Problem42;

public class Day {
	String work;
	void set(String work) { this.work = work; }
	String get() { return work; }
	void show() {
		if(work == null) System.out.print("Nothing");
		else System.out.print("There is [" + work + "]");
	}
}
