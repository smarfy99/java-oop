package Problem2;

import java.util.Scanner;

public class Prob1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("The number of integers: ");
        int numint = scanner.nextInt();
        int[] intarr = new int[10];

        System.out.print("Write all integers: ");
        double mean = 0, squaremean = 0;
        for (int i = 0; i < numint; i++) {
            intarr[i] = scanner.nextInt();
            mean += intarr[i];
            squaremean += intarr[i] * intarr[i];
        }
        mean /= numint;
        squaremean /= numint;
        System.out.println("Mean: " + mean);
        System.out.println("Variance: " + (squaremean - mean * mean));

        scanner.close();
    }

}
