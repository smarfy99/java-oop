package LearningClass;

public class Student {
    String name;
    int studentNo = 20230000;
    String grade="A";
    double score;
    Laptop laptop = new Laptop("Galaxy", 2020);

//    constructor
//    constructor로 빈 객체를 생성해주니까 다른 곳에서 Student를 불러올 때는 굳이 다시 빈 객체를 new로 불러오지 않아도 된다.
//    같은 이름의 다른 매개변수를 가진 constructor를 오버로딩으로 여러개 만들 수 있다.
//    생성자 오버로딩 : type이나 매개변수 개수가 다르면 됨
    Student() {}

    Student(String name) {
//        this를 붙여야 해당 해당 scope의
        this.name=name;
    }

    Student(String name, int studentNo) {
        this(name);
        this.studentNo = studentNo;
    }

    Student(String name, int studentNo, String grade){
//        이 this 생성자는 위의 생성자를 호출하는 것과 같다.
        this(name, studentNo);
        this.grade = grade;
    }

    Student(String name, String laptopModel, int laptopYear){
        this(name);
        laptop = new Laptop(laptopModel, laptopYear);
    }

    void run() {
        System.out.println("The Student"+name+"is running");
    }

    void setGrade(String grade){
//        this는 grade를 업데이트 시켜즘
        this.grade = grade;
    }

    double getGradeNumber() {
        double gradeNumber;
        if (grade == "A") gradeNumber = 4.0;
        else gradeNumber = -1;
        return gradeNumber;
    }

//    double의 변수를 여러개 받을 수 있다. 배열로 받을 수 있음.
    void sumScores(double ... values) {
        score = 0.0;
        for (int i=0; i<values.length; i++) {
            score += values[i];
        }
    }
}
