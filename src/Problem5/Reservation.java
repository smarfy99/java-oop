package Problem5;

import java.util.Scanner;

public class Reservation {
	private SeatArray[] seatArrays;
	private char[] seatTypes = {'S', 'A', 'B'};
	private Scanner scanner;
	
	public Reservation() {
		seatArrays = new SeatArray[seatTypes.length];
		for (int i=0; i < seatArrays.length; i++) {
			seatArrays[i] = new SeatArray(seatTypes[i]);
		}
		scanner = new Scanner(System.in);
	}
	
	private void reserve() {
		System.out.print("Seat Type ");
		for (int i =0; i < seatArrays.length; i++) {
			System.out.print(seatTypes[i] + "(" + (i+1) + ")");
//			마지막 좌석은 , 없으니까
			if(i != seatTypes.length -1) System.out.print(", ");
			else{System.out.print(" >> ");}
		}
//		같은 줄에 입력받은 값 넣고, nextLine
		int seatTypeNumber = scanner.nextInt();
		scanner.nextLine();
		seatArrays[seatTypeNumber - 1].show();
		System.out.print("Name >> ");
		String inputName = scanner.nextLine();
		System.out.print("Seat Number >> ");
		int seatNumber = scanner.nextInt();
		seatArrays[seatTypeNumber - 1].reserve(seatNumber, inputName);
	}

	private void search() {
		for (int i = 0; i < seatTypes.length; i++) {
			seatArrays[i].show();
		}
		System.out.println("This is the end of the search.");
	}

	private void cancel() {
		System.out.print("Seat Type ");
		for (int i = 0; i < seatTypes.length; i++) {
			System.out.print(seatTypes[i] + "(" + (i + 1) + ")");
			if (i != seatTypes.length - 1) System.out.print(", ");
			else System.out.print(" >> ");
		}
		int seatTypeNumber = scanner.nextInt();
		scanner.nextLine();
		seatArrays[seatTypeNumber - 1].show();
		System.out.print("Name >> ");
		String inputName = scanner.nextLine();
		seatArrays[seatTypeNumber - 1].cancel(inputName);
	}

	private void quit() {
		System.out.println("Thank you!");
	}

	public void run() {
		System.out.println("This is a reservation system for music concert.");
		System.out.println();
//		switch문을 위한 변수 선언은 run 함수가 실행될 때만 필요하니까 여기서 선언
		int state;
		while(true) {
			System.out.print("Reserve: 1, Search: 2, Cancel: 3, Quit: 4 >> ");
			state = scanner.nextInt();
			switch(state) {
				case 1:
					reserve();
					break;
				case 2:
					search();
					break;
				case 3:
					cancel();
					break;
				case 4:
					quit();
//					return하면 while문 탈출
					return;
				default:
					System.out.println("This is a wrong command.");
			}
			System.out.println();
		}
	}
}
