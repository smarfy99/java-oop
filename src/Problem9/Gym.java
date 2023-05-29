package Problem9;

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
        System.out.print("Type을 입력해주세요.(soccer, basketball)>>>");
        String type = scanner.next();
        System.out.print("이름을 입력해주세요.>>>");
        String name = scanner.next();
        System.out.print("예약하고픈 방 번호를 입력해주세요.(1~16)>>>");
        int roomNum = scanner.nextInt();

        if(type.equals("soccer")) {
            if(roomNum >= 1 && roomNum <= playerLength && sc[roomNum-1] == null) {
                System.out.print("축구 선수의 킥 속도를 입력해주세요.>>>");
                double kickSpeed = scanner.nextDouble();
                SoccerPlayer player = new SoccerPlayer(name, kickSpeed);
                sc[roomNum - 1] = player;
                System.out.println("예약이 완료되었습니다!");
            } else{
                System.out.println("해당 방은 예약할 수 없습니다.");
            }
        } else if(type.equals("basketball")) {
            if(roomNum >= 1 && roomNum <= playerLength && bsk[roomNum-1] == null) {
                BasketBallPlayer player = new BasketBallPlayer(name);
                bsk[roomNum - 1] = player;
                System.out.println("예약이 완료되었습니다!");
            } else {
                System.out.println("해당 방은 예약할 수 없습니다.");
            }
        }else {
            System.out.println("잘못된 플레이어 유형입니다.");
        }
    }

    private void search() {
        System.out.print("Type을 입력해주세요.(soccer, basketball)>>>");
        String type = scanner.next();
        System.out.print("방 번호를 입력해주세요.(1~16)>>>");
        int roomNum = scanner.nextInt();

        if(type.equals("soccer")) {
            if(roomNum >= 1 && roomNum <= playerLength && sc[roomNum-1] != null) {
                SoccerPlayer player = sc[roomNum-1];
                player.showDetails();
            }else{
                System.out.println("No reservation");
            }
        } else if (type.equals("basketball")) {
            if(roomNum >= 1 && roomNum <= playerLength && bsk[roomNum-1] != null) {
                BasketBallPlayer player = bsk[roomNum-1];
                player.showDetails();
            } else {
                System.out.println("No reservation");
            }
        }else{
            System.out.println("잘못된 플레이어 유형입니다.");
        }
    }

    private void cancel() {
        System.out.print("Type을 입력해주세요.(soccer, basketball)>>>");
        String type = scanner.next();
        System.out.print("이름을 입력해주세요.>>>");
        String name = scanner.next();

        if (type.equals("soccer")) {
            for (int i = 0; i < playerLength; i++) {
                if (sc[i] != null && sc[i].getName().equals(name)) {
                    sc[i] = null;
                    System.out.println("예약이 취소되었습니다.");
                    return;
                }
            }
        } else if (type.equals("basketball")) {
            for (int i = 0; i < playerLength; i++) {
                if (bsk[i] != null && bsk[i].getName().equals(name)) {
                    bsk[i] = null;
                    System.out.println("예약이 취소되었습니다.");
                    return;
                }
            }
        } else {
            System.out.println("잘못된 플레이어 유형입니다.");
        }

        System.out.println("예약된 선수가 아니므로 취소할 수 없습니다.");
    }

    private void quit() {
        System.out.println("Thank you!");
    }

    public void run() {
        System.out.println("This is a reservation system for gym.");
        System.out.println();
        int state;
        while(true) {
            System.out.print("This is a reservation system for gym.");
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
                    return;
                default:
                    System.out.println("This is a wrong command.");
            }
            System.out.println();
        }
    }
}
