package Problem4.Problem42;

public class Day {
    String work;

    void set(String work) {this.work = work;}
    String get() {return work;}

    String show() {
        if(work == null) return "Nothing";
        else return "There is [" + work + "]";
    }
}
