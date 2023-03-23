package Problem2;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args){
        String[] words = new String[5];

        System.out.println("5개의 string을 ,로 구분지어 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        words = input.split(",");

        for (int i=0; i<words.length; i++){
            if(words[i].contains("java")){
                words[i] = words[i].replace("java","python");
                System.out.println(i+"번째,"+"true,"+words[i]);
            }else {
                System.out.println(i + "번째," + "false," + words[i]);
            }
        }

    }
}
