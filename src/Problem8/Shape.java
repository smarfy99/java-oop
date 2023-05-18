package Problem8;

public interface Shape {
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("---Redrawing...");
        draw();
    }
}
