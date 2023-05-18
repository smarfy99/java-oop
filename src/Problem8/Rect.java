package Problem8;

import Problem5.Seat;

public class Rect implements Shape, Angular {
    //    field
    private double x,y;

    public Rect(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println ("Rectangle with " + x + "x" + y);
    }

    @Override
    public double getArea() {
        return Math.floor(x * y);
    }

    @Override
    public void printVertex() {
        double realX = Math.round(x/2);
        double realY = Math.round(y/2);
        System.out.println("Vertex: ("+-realX+","+-realY+")("+realX+","+-realY+")("+-realX+","+realY+")("+realX+","+realY+")");
    }
}