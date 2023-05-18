package Problem8;

public class Oval implements Shape {
    //    field
    private double x,y;

    public Oval(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println ("Oval with " + x +"x" + y );
    }

    @Override
    public double getArea() {
        return Math.floor(PI * x * y);
    }
}