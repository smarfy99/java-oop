package Problem7;

import java.util.Scanner;

public class Calculator {
	Calc cal;
	Scanner scanner = new Scanner(System.in);
	
	void setCalculator(Calc cal) {
		this.cal = cal;
	}
	
	void run() {
		System.out.print("Write two integers >> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		cal.setValue(a, b);
		System.out.println(cal.calculate());
	}
}
