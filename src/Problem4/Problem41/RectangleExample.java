package Problem4.Problem41;

public class RectangleExample {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("Area of s is: " + s.square());
		if(t.contains(r)) System.out.println("t contains r.");
		if(t.contains(s)) System.out.println("t contains s.");
	}
}
