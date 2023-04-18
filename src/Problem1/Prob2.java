package Problem1;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Amount of money: ");
		int money = scanner.nextInt();
		
		int quotient;
		quotient = money / 50000;
		money = money % 50000;
		System.out.println("50000won: " + quotient);
		
		quotient = money / 10000;
		money = money % 10000;
		System.out.println("10000won: " + quotient);
		
		quotient = money / 1000;
		money = money % 1000;
		System.out.println("1000won: " + quotient);
		
		quotient = money / 500;
		money = money % 500;
		System.out.println("500won: " + quotient);
		
		quotient = money / 100;
		money = money % 100;
		System.out.println("100won: " + quotient);

		quotient = money / 50;
		money = money % 50;
		System.out.println("50won: " + quotient);
						
		quotient = money / 10;
		money = money % 10;
		System.out.println("10won: " + quotient);
		System.out.println("1won: " + money);
								
		scanner.close();
	}

}
