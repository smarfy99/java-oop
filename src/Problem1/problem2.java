package Problem1;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        int money;
        int array [] = {50000, 10000, 1000, 500, 100, 10, 1};

        Scanner sc = new Scanner(System.in);
        money = sc.nextInt();

        for(int i: array){
            System.out.println(i+" "+money/i);
            money -= i*(money/i);
        }
    }
}
