package Problem1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Center: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.print("Radius: ");
		int r = scanner.nextInt();
		
		System.out.print("Point: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if ((x - a)*(x - a) + (y - b)*(y - b) <= r*r) {
			System.out.println("The point is in the circle.");
		}
		else {
			System.out.println("The point is not in the circle.");
		}
		
		scanner.close();
	}
}
