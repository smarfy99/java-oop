package Problem8;

public interface Shape {
    double PI = 3.14;
    void draw();
    double getArea();
    default void redraw() {
        System.out.print("---Redrawing...");
        draw();
    }
}
