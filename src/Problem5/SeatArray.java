package Problem5;

public class SeatArray {
	private char seatType;
	private Seat[] seats;
	private static int seatLength = 16;
	
	public SeatArray(char seatType) {
		this.seatType = seatType;
		seats = new Seat[seatLength];
		for (int i = 0; i < seatLength; i++) {
			seats[i] = new Seat();
		}
	}
	
	public void reserve(int seatNumber, String name) {
//		잘못된 좌석넘버를 입력하면 에러까지 신경쓸 것
		if (seatNumber >= 0 && seatNumber < seatLength) {
			seats[seatNumber-1].setName(name);
		} else{
			System.out.println("잘못입력하셨어요. 다시 입력해주세요.");
		}
	}
	
	public void show() {
		System.out.print(seatType + ">>");
		for (int i=0; i < seatLength; i++) {
			seats[i].show();
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public void cancel(String name) {
		for (int i=0; i < seatLength; i++) {
			if (seats[i].isMatched(name)) {
				seats[i].cancel();
				return;
			}
		}
		System.out.println(name + " 님은 좌석을 예매하지 않으셨습니다.");
	}
}
