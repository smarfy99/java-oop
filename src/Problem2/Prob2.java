package Problem2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Write five strings with comma(,): ");
		String[] strarr = scanner.nextLine().split(",");
		for (String str: strarr) {
			if (str.contains("java")) {
				System.out.println(str + ": true, " + str.replace("java", "python"));
			}
			else {
				System.out.println(str + ": false");
			}
		}
		scanner.close();

	}

}
