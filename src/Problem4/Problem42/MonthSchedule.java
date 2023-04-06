package Problem4.Problem42;

import java.util.Scanner;

public class MonthSchedule {
    Scanner scanner = new Scanner(System.in);
    int dayOfMonth;
    int select;
    int date;
    String todo;
    Day[] dayArray;


    MonthSchedule(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        dayArray = new Day[dayOfMonth];
    }
    void run() {
        System.out.println("This is a schedule management program for this month.");
        System.out.println("Insert: 1, Show: 2, Quit: 3");
        select = scanner.nextInt();
        while(select != 3) {
            if(select == 1) input();
            if(select == 2) view();
            System.out.println("Insert: 1, Show: 2, Quit: 3");
            select = scanner.nextInt();
        }
        finish();
    }

//    1.insert
    void input() {
//        java의 this는 class인 자기 자신을 가리킴. js는 동적 바인딩.
//        this.select = select; 를 할 필요가 없음
        System.out.print("Date(1-"+dayOfMonth+")?");
        date = scanner.nextInt();
        System.out.print("Do list (without space)?");
        todo = scanner.next();
        dayArray[date-1] = new Day();
        dayArray[date-1].set(todo);
    }

//    2.show
    void view() {
        System.out.println("Date(1-"+dayOfMonth+")?" + date);
        System.out.println(dayArray[date-1].show() + " on the "+date+"th.");
    }

//    3.quit
    void finish() {
        System.out.println("This is the end of the program.");
    }
}
