package Problem1;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Write the length of a triangle: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if ((a + b > c) && (b + c > a) && (c + a > b)) {
			System.out.println("These lengths can construct a triangle.");
		}
		else {
			System.out.println("These lengths cannot construct a triangle.");
		}
		scanner.close();
	}

}
