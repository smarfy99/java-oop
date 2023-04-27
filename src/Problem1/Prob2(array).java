//package Problem1;
//
//import java.util.Scanner;
//
//public class Prob2 {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Amount of money: ");
//		int money = scanner.nextInt();
//		int[] units = {50000, 10000, 1000, 500, 100, 50, 10, 1};
//
//		int quotient;
//		for (int unit: units) {
//			quotient = money / unit;
//			money = money % unit;
//			System.out.println(unit + "won: " + quotient);
//		}
//
//		scanner.close();
//	}
//
//}
