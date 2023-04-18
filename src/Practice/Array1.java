package Practice;

public class Array1 {
    public static void main(String[] args) {
//        배열 변수 선언
        int[] scores;
//        배열 변수에 배열 대입
        scores = new int[] {83,90,87};
        printItem(new int[] {83,90,87});
    }

//    printItem() 메소드 선언
    public static void printItem(int[] scores){
        for(int i=0; i<3; i++) {
            System.out.println("score["+i+"]:"+scores[i]);
        }
    }
}
