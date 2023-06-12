package Problem9_class;

import java.util.Scanner;

public class Gym {
	private SoccerPlayer[] sc;
	private BasketBallPlayer[] bsk;
	private Scanner scanner = new Scanner(System.in);
	private static int playerLength = 16;
	
	Gym() {
		sc = new SoccerPlayer[playerLength];
		bsk = new BasketBallPlayer[playerLength];
	}
	
	private void reserve() {
		System.out.print("Player Type >> ");
		String player = scanner.nextLine();
		System.out.print("Name >> ");
		String name = scanner.nextLine();
		System.out.print("Room Number >> ");
		int roomNo = scanner.nextInt();
		System.out.print("Speed >> ");
		double speed = scanner.nextDouble();
		System.out.print("The number of tools >> ");
		int toolLength = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Tools you want to leave >> ");
		String[] tools = new String[toolLength];
		for(int i = 0; i < toolLength; i++) {
			tools[i] = scanner.nextLine();
		}
		
		if (player.equals("Soccer")) {
			System.out.print("Kick speed >> ");
			double kickSpeed = scanner.nextDouble();
			sc[roomNo + 1] = new SoccerPlayer(name, kickSpeed);
			sc[roomNo + 1].setSpeed(speed);
			sc[roomNo + 1].setTools(tools);
		}
		else if(player.equals("BasketBall")) {
			System.out.print("Jump >> ");
			double jump = scanner.nextDouble();
			bsk[roomNo + 1] = new BasketBallPlayer(name);
			bsk[roomNo + 1].setSpeed(speed);
			bsk[roomNo + 1].setJump(jump);
			bsk[roomNo + 1].setTools(tools);
		}

	}
	
	private void search() {
		System.out.print("Player Type >> ");
		String player = scanner.nextLine();
		System.out.print("Room Number >> ");
		int roomNo = scanner.nextInt();
		if (player.equals("Soccer") && sc[roomNo + 1] != null) {
			sc[roomNo + 1].showDetails();
		}
		else if(player.equals("BasketBall") && bsk[roomNo + 1] != null) {
			bsk[roomNo + 1].showDetails();
		}
		else {
			System.out.println("No information");
		}
	}
	
	private void cancel() {
		System.out.print("Name >> ");
		String name = scanner.nextLine();
		for (int i = 0; i < playerLength; i++) {
			if (sc[i] != null && name.equals(sc[i].getName())) {
				sc[i] = null;
				return;
			}
			else if (bsk[i] != null && name.equals(bsk[i].getName())) {
				bsk[i] = null;
				return;
			}
		}
		System.out.println("There is no reservation.");
	}
	
	private void quit() {
		System.out.println("Thank you!");
	}
	
	public void run() {
		System.out.println("This is a reservation system for music concert.");
		System.out.println();
		int state;
		while(true) {
			System.out.print("Reserve: 1, Search: 2, Cancel: 3, Quit: 4 >> ");
			state = scanner.nextInt();
			scanner.nextLine();
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
				return;
			default:
				System.out.println("This is a wrong command.");
			}
			System.out.println();
		}
	}
}
