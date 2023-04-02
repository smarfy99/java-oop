package Problem3;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            // 공백 출력
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // 숫자 출력
            for (int j = i; j >=0; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // 줄바꿈
            System.out.println();
        }
    }
}