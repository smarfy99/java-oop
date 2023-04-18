package Problem3;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		String[] students = new String[5];
		float[][] scores = new float[7][5];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Write the name of the student No." + (i + 1) + " >> ");
			students[i] = scanner.nextLine();
			System.out.print("Write the Korea, English, Math scores of the Student " + students[i] + " >> ");
			scores[i][0] = scanner.nextFloat();
			scores[i][1] = scanner.nextFloat();
			scores[i][2] = scanner.nextFloat();
			scanner.nextLine();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				scores[i][3] += scores[i][j];
				scores[5][j] += scores[i][j];
			}
			scores[i][4] = scores[i][3] / 3;
		}
		    
		for (int j = 0; j < 3; j++) {
			scores[6][j] = scores[5][j] / 5;
		}

		System.out.println("Name\tKorean\tEnglish\tMath\tSum\tAverage");
		for (int i = 0; i < 5; i++) {
			System.out.print(students[i] + "\t");
			for (int j = 0; j < 5; j++) {
				System.out.printf("%.2f\t", scores[i][j]);
			}
			System.out.println();
		}

		System.out.print("sum\t");
		for (int j = 0; j < 3; j++) {
			System.out.printf("%.2f\t", scores[5][j]);
		}
		System.out.println();

		System.out.print("average\t");
		for (int j = 0; j < 3; j++) {
			System.out.printf("%.2f\t", scores[6][j]);
		}
		System.out.println();
		scanner.close();
	}
}
