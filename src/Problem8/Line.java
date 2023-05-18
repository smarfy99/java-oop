package Problem8;

public class Line implements Angular{
    private double a,b;

    public Line(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void printVertex() {
        double realX = Math.round(a-(b/2));
        double realY = Math.round(b-(b/2));
        System.out.println("Vertex: ("+realX+","+"0)("+realY+","+"0)");
    }
}
