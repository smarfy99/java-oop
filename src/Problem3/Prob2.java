package Problem3;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		int start_number = 0;
		int current_number;

		System.out.print("Write the number of lines >> ");
		Scanner scanner = new Scanner(System.in);
		int line_count = scanner.nextInt();

		for (int i = 0; i < line_count; i++) {
			current_number = start_number;
			for (int j = 0; j < line_count - start_number - 1; j++) System.out.print(" ");
			for (int j = 0; j < 2 * start_number + 1; j++) {
				System.out.print(current_number >= 0? current_number : -current_number);
				current_number--;
			}
			System.out.println();
			start_number++;
		}
		scanner.close();
	}

}
