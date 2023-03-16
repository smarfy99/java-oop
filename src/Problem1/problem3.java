package Problem1;
import java.util.Scanner;

public class problem3 {
    public static String checkTriangle(int a, int b, int c){
        if(a+b > c && a+c > b && b+c > a){
            return "Triangle";
        }
        return "No Triangle";
    }
    public static void main(String[] args){
        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);

        System.out.println("length?");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println(checkTriangle(a,b,c));
    }
}
