package Problem2;

import java.util.Scanner;

//10개 이하의 정수를 취하여 배열에 넣고 정수의 평균과 분산을 계산하라.
public class problem1 {
    public static void main(String[] args) {
//        배열생성
        int[] intArray = new int[10]; //10길이인 배열 생성

//        입력받기
        System.out.println("10개의 정수를 띄어써서 입력해주세요.");
        Scanner sc = new Scanner(System.in);
//        입력받은 정수를 배열에 순서에 맞게 저장
        String input = sc.nextLine();
//        intArray = Integer.parseInt(input).split(" ");
        String[] stringArray = input.split(" ");

        for (int i=0; i<intArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

//        총합
        int sum = 0;
        for (int x=0; x<intArray.length; x++){
            sum += intArray[x];
        }
//        평균
        double average = (double) sum / intArray.length;
//        분산
        double total = 0;
        for (int i=0; i<intArray.length; i++){
            total += (intArray[i]-average)*(intArray[i]-average);
        }
        double dev = total / intArray.length;

        System.out.println(average);
        System.out.println(dev);
    }
}
