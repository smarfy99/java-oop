package Overriding1;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator computer = new Computer();
        System.out.println("원 면적: " + computer.areaCircle(r));
    }
}
