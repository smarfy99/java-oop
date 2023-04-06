package LearningClass;

public class StudentExample {
    public static void main(String[] args) {
        Student st1 = new Student("Mike");
        System.out.println("st1's name:" + st1.name);
        System.out.println("st1's score:" + st1.score);
        System.out.println("st1's laptop:" + st1.laptop.model);

        st1.run();
        st1.setGrade("A");
        System.out.println();
        double[] scores = {30,34,66};
        st1.sumScores(scores);

        Student st2 = new Student("Mike", 20230000);
        st2.name = "Mike";
        System.out.println("st2's name:"+st2.name);
        System.out.println("st2's name:"+st2.studentNo);
    }

}
