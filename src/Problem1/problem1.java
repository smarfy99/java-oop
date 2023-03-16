package Problem1;

import java.util.Scanner;
public class problem1 {
    public static String circleTrue(int centerX, int centerY, int radius, int randomX, int randomY) {
        double result = Math.pow((centerX-randomX),2) + Math.pow((centerY-randomY),2);
        if(Math.pow(radius,2) > result){
            return "This is in circle.";
        }
//        else는 최대한 줄이도록 해보쟈!!!
            return "This is not in circle.";
    }
    public static void main(String[] args) {
        int centerX;
        int centerY;
        int radius;
        int randomX;
        int randomY;

        Scanner sc = new Scanner(System.in);
        System.out.println("Circle");
        centerX = sc.nextInt();
        centerY = sc.nextInt();
        radius = sc.nextInt();
        System.out.println("Point");
        randomX = sc.nextInt();
        randomY = sc.nextInt();

        System.out.println(circleTrue(centerX, centerY, radius, randomX, randomY));
    }
}