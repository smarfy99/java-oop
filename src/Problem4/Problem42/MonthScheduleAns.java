package Problem4.Problem42;

import java.util.Scanner;

public class MonthSchedule {
	int totalDate;
	Day[] dayarr;
	Scanner scanner;
	
	MonthSchedule(int totalDate) {
		this.totalDate = totalDate;
		dayarr = new Day[totalDate];
		for(int i = 0; i < dayarr.length; i++) {
			dayarr[i] = new Day();
		}
		scanner = new Scanner(System.in);
	}
	
	void input() {
		System.out.println("Date(1-" + totalDate + ")? ");
		int date = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Do list (without space)? ");
		String dolist = scanner.nextLine();
		dayarr[date - 1].set(dolist);
	}
	
	void view() {
		System.out.println("Date(1-" + totalDate + ")? ");
		int date = scanner.nextInt();
		scanner.nextLine();
		System.out.print("There is ");
		dayarr[date - 1].show();
		System.out.println(" on the " + date + "th.");
	}
	
	void finish() {
		System.out.println("This is the end of the program.");
	}
	
	void run() {
		System.out.println("This is a schedule management program for this month.");
		int command;
		while(true) {
			System.out.print("Command(Insert: 1, Show: 2, Quit: 3 >> ");
			command = scanner.nextInt();
			switch(command) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				return;
			default:
				System.out.println("Wrong input");
				break;
			}
		}
	}
}
