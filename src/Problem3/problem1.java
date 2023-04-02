package Problem3;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        double[][] table = new double[7][5];

        double kor;
        double eng;
        double math;
        double sum;
        double mean;

        System.out.println("5명의 학생의 성적을 입력해주세요.");
        Scanner sc = new Scanner(System.in);

        String[] names = new String[7];
        String[] inputData;

        names[5] = "Sum";
        names[6] = "Mean";

        for(int i=0; i<5; i++) {
            System.out.printf("%d번째 학생 : ", i+1);
            String input = sc.nextLine();
            inputData = input.split(",");
            names[i] = inputData[0];
            table[i][0] = Integer.parseInt(inputData[1]);
            table[i][1] = Integer.parseInt(inputData[2]);
            table[i][2] = Integer.parseInt(inputData[3]);
            table[i][3] = table[i][0]+table[i][1]+table[i][2];
            table[i][4] = table[i][3]/3;
        }
        for(int j=0; j<3; j++) {
            table[5][j] = table[j][0]+table[j][1]+table[j][2]+table[j][3]+table[j][4];
            table[6][j] = table[5][j]/5;
        }
        System.out.println("Name "+"Korean "+"English "+"Math "+"Sum "+"Mean");
        for(int k=0; k<7; k++){
            double[] scores = table[k];
            System.out.print(names[k]);
            for(int s=0; s<scores.length; s++){
                System.out.print(scores[s]+" ");
            }
            System.out.println();
        }
    }
}
